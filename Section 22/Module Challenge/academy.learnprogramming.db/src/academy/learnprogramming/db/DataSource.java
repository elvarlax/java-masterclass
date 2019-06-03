package academy.learnprogramming.db;

import academy.learnprogramming.common.Album;
import academy.learnprogramming.common.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static final String DB_NAME = "music.db";

    //    private static final String CONNECTION_STRING = "jdbc:sqlite:D:\\databases\\" + DB_NAME;
    private static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

    private static final String TABLE_ALBUMS = "albums";
    private static final String COLUMN_ALBUM_ID = "_id";
    private static final String COLUMN_ALBUM_NAME = "name";
    private static final String COLUMN_ALBUM_ARTIST = "artist";
    private static final int INDEX_ALBUM_ID = 1;
    private static final int INDEX_ALBUM_NAME = 2;
    private static final int INDEX_ALBUM_ARTIST = 3;

    private static final String TABLE_ARTISTS = "artists";
    private static final String COLUMN_ARTIST_ID = "_id";
    private static final String COLUMN_ARTIST_NAME = "name";
    private static final int INDEX_ARTIST_ID = 1;
    private static final int INDEX_ARTIST_NAME = 2;

    private static final String TABLE_SONGS = "songs";
    private static final String COLUMN_SONG_ID = "_id";
    private static final String COLUMN_SONG_TRACK = "track";
    private static final String COLUMN_SONG_TITLE = "title";
    private static final String COLUMN_SONG_ALBUM = "album";
    private static final int INDEX_SONG_ID = 1;
    private static final int INDEX_SONG_TRACK = 2;
    private static final int INDEX_SONG_TITLE = 3;
    private static final int INDEX_SONG_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    private static final String QUERY_ALBUMS_BY_ARTIST_START =
            "SELECT " + TABLE_ALBUMS + '.' + COLUMN_ALBUM_NAME + " FROM " + TABLE_ALBUMS +
                    " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST +
                    " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + " = \"";

    private static final String QUERY_ALBUMS_BY_ARTIST_SORT =
            " ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

    private static final String QUERY_ARTIST_FOR_SONG_START =
            "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " +
                    TABLE_SONGS + "." + COLUMN_SONG_TRACK + " FROM " + TABLE_SONGS +
                    " INNER JOIN " + TABLE_ALBUMS + " ON " +
                    TABLE_SONGS + "." + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
                    " INNER JOIN " + TABLE_ARTISTS + " ON " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_SONGS + "." + COLUMN_SONG_TITLE + " = \"";

    private static final String QUERY_ARTIST_FOR_SONG_SORT =
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

    private static final String TABLE_ARTIST_SONG_VIEW = "artist_list";

    private static final String CREATE_ARTIST_FOR_SONG_VIEW = "CREATE VIEW IF NOT EXISTS " +
            TABLE_ARTIST_SONG_VIEW + " AS SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
            TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " AS " + COLUMN_SONG_ALBUM + ", " +
            TABLE_SONGS + "." + COLUMN_SONG_TRACK + ", " + TABLE_SONGS + "." + COLUMN_SONG_TITLE +
            " FROM " + TABLE_SONGS +
            " INNER JOIN " + TABLE_ALBUMS + " ON " + TABLE_SONGS +
            "." + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
            " INNER JOIN " + TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST +
            " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
            " ORDER BY " +
            TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
            TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " +
            TABLE_SONGS + "." + COLUMN_SONG_TRACK;

    private static final String QUERY_VIEW_SONG_INFO = "SELECT " + COLUMN_ARTIST_NAME + ", " +
            COLUMN_SONG_ALBUM + ", " + COLUMN_SONG_TRACK + " FROM " + TABLE_ARTIST_SONG_VIEW +
            " WHERE " + COLUMN_SONG_TITLE + " = \"";

    private static final String QUERY_VIEW_SONG_INFO_PREP = "SELECT " + COLUMN_ARTIST_NAME + ", " +
            COLUMN_SONG_ALBUM + ", " + COLUMN_SONG_TRACK + " FROM " + TABLE_ARTIST_SONG_VIEW +
            " WHERE " + COLUMN_SONG_TITLE + " = ?";

    private static final String INSERT_ARTIST = "INSERT INTO " + TABLE_ARTISTS +
            '(' + COLUMN_ARTIST_NAME + ") VALUES(?)";
    private static final String INSERT_ALBUMS = "INSERT INTO " + TABLE_ALBUMS +
            '(' + COLUMN_ALBUM_NAME + ", " + COLUMN_ALBUM_ARTIST + ") VALUES(?, ?)";

    private static final String INSERT_SONGS = "INSERT INTO " + TABLE_SONGS +
            '(' + COLUMN_SONG_TRACK + ", " + COLUMN_SONG_TITLE + ", " + COLUMN_SONG_ALBUM +
            ") VALUES(?, ?, ?)";

    private static final String QUERY_ARTIST = "SELECT " + COLUMN_ARTIST_ID + " FROM " +
            TABLE_ARTISTS + " WHERE " + COLUMN_ARTIST_NAME + " = ?";

    private static final String QUERY_ALBUM = "SELECT " + COLUMN_ALBUM_ID + " FROM " +
            TABLE_ALBUMS + " WHERE " + COLUMN_ALBUM_NAME + " = ?";

    private static final String QUERY_ALBUMS_BY_ARTIST_ID = "SELECT * FROM " + TABLE_ALBUMS +
            " WHERE " + COLUMN_ALBUM_ARTIST + " = ? ORDER BY " + COLUMN_ALBUM_NAME + " COLLATE NOCASE";

    private static final String UPDATE_ARTIST_NAME = "UPDATE " + TABLE_ARTISTS + " SET " +
            COLUMN_ARTIST_NAME + " = ? WHERE " + COLUMN_ARTIST_ID + " = ?";

    private Connection conn;

    private PreparedStatement querySongInfoView;

    private PreparedStatement insertIntoArtists;
    private PreparedStatement insertIntoAlbums;
    private PreparedStatement insertIntoSongs;

    private PreparedStatement queryArtist;
    private PreparedStatement queryAlbum;
    private PreparedStatement queryAlbumsByArtistId;
    private PreparedStatement updateArtistName;

    private static DataSource instance = new DataSource();

    private DataSource() {

    }

    public static DataSource getInstance() {
        return instance;
    }

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            createViewForSongArtists();
            querySongInfoView = conn.prepareStatement(QUERY_VIEW_SONG_INFO_PREP);
            insertIntoArtists = conn.prepareStatement(INSERT_ARTIST, Statement.RETURN_GENERATED_KEYS);
            insertIntoAlbums = conn.prepareStatement(INSERT_ALBUMS, Statement.RETURN_GENERATED_KEYS);
            insertIntoSongs = conn.prepareStatement(INSERT_SONGS);
            queryArtist = conn.prepareStatement(QUERY_ARTIST);
            queryAlbum = conn.prepareStatement(QUERY_ALBUM);
            queryAlbumsByArtistId = conn.prepareStatement(QUERY_ALBUMS_BY_ARTIST_ID);
            updateArtistName = conn.prepareStatement(UPDATE_ARTIST_NAME);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (querySongInfoView != null) {
                querySongInfoView.close();
            }
            if (insertIntoArtists != null) {
                insertIntoArtists.close();
            }
            if (insertIntoAlbums != null) {
                insertIntoAlbums.close();
            }
            if (insertIntoSongs != null) {
                insertIntoSongs.close();
            }
            if (queryArtist != null) {
                queryArtist.close();
            }
            if (queryAlbum != null) {
                queryAlbum.close();
            }
            if (queryAlbumsByArtistId != null) {
                queryAlbumsByArtistId.close();
            }
            if (updateArtistName != null) {
                updateArtistName.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public List<Artist> queryArtists(int sortOrder) {
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if (sortOrder != ORDER_BY_NONE) {
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            sb.append(" COLLATE NOCASE ");
            if (sortOrder == ORDER_BY_DESC) {
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {
            List<Artist> artists = new ArrayList<>();
            while (results.next()) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    System.out.println("Interuppted: " + e.getMessage());
                }
                Artist artist = new Artist();
                artist.setId(results.getInt(INDEX_ARTIST_ID));
                artist.setName(results.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<Album> queryAlbumsForArtistId(int id) {
        try {
            queryAlbumsByArtistId.setInt(1, id);
            ResultSet results = queryAlbumsByArtistId.executeQuery();
            List<Album> albums = new ArrayList<>();
            while (results.next()) {
                Album album = new Album();
                album.setId(results.getInt(1));
                album.setName(results.getString(2));
                album.setArtistId(id);
                albums.add(album);
            }
            return albums;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<String> queryAlbumsForArtist(String artistName, int sortOrder) {
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_START);
        sb.append(artistName);
        sb.append("\"");

        if (sortOrder != ORDER_BY_NONE) {
            sb.append(QUERY_ALBUMS_BY_ARTIST_SORT);
            if (sortOrder == ORDER_BY_DESC) {
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL statement = " + sb.toString());

        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {
            List<String> albums = new ArrayList<>();
            while (results.next()) {
                albums.add(results.getString(1));
            }
            return albums;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public void querySongsMetadata() {
        String sql = "SELECT * FROM " + TABLE_SONGS;
        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {
            ResultSetMetaData meta = results.getMetaData();
            int numColumns = meta.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.format("Column %d in the songs table is names %s\n", i, meta.getColumnName(i));
            }
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
        }
    }

    public int getCount(String table) {
        String sql = "SELECT COUNT(*) AS count FROM " + table;
        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(sql)) {
            int count = results.getInt("count");
            System.out.format("Count = %d\n", count);
            return count;
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return -1;
        }
    }

    private boolean createViewForSongArtists() {
        try (Statement statement = conn.createStatement()) {
            statement.execute(CREATE_ARTIST_FOR_SONG_VIEW);
            return true;
        } catch (SQLException e) {
            System.out.println("Create View failed: " + e.getMessage());
            return false;
        }
    }

    private int insertArtist(String name) throws SQLException {
        queryArtist.setString(1, name);
        ResultSet results = queryArtist.executeQuery();
        if (results.next()) {
            return results.getInt(1);
        } else {
            // Insert the artist
            insertIntoArtists.setString(1, name);
            int affectedRows = insertIntoArtists.executeUpdate();

            if (affectedRows != 1) {
                throw new SQLException("Couldn't insert artist!");
            }

            ResultSet generatedKeys = insertIntoArtists.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Couldn't get _id for artist");
            }
        }
    }

    private int insertAlbum(String name, int artistId) throws SQLException {
        queryAlbum.setString(1, name);
        ResultSet results = queryAlbum.executeQuery();
        if (results.next()) {
            return results.getInt(1);
        } else {
            // Insert the album
            insertIntoAlbums.setString(1, name);
            insertIntoAlbums.setInt(2, artistId);
            int affectedRows = insertIntoAlbums.executeUpdate();

            if (affectedRows != 1) {
                throw new SQLException("Couldn't insert album!");
            }

            ResultSet generatedKeys = insertIntoAlbums.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Couldn't get _id for album");
            }
        }
    }

    public boolean updateArtistName(int id, String newName) {
        try {
            updateArtistName.setString(1, newName);
            updateArtistName.setInt(2, id);
            int affectedRecords = updateArtistName.executeUpdate();
            return affectedRecords == 1;
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
            return false;
        }
    }

    public void insertSong(String title, String artist, String album, int track) {
        try {
            conn.setAutoCommit(false);
            int artistId = insertArtist(artist);
            int albumId = insertAlbum(album, artistId);
            insertIntoSongs.setInt(1, track);
            insertIntoSongs.setString(2, title);
            insertIntoSongs.setInt(3, albumId);
            int affectedRows = insertIntoSongs.executeUpdate();
            if (affectedRows == 1) {
                conn.commit();
            } else {
                throw new SQLException("The song insert failed");
            }
        } catch (Exception e) {
            System.out.println("Insert song exception: " + e.getMessage());
            try {
                System.out.println("Performing rollback");
                conn.rollback();
            } catch (SQLException e2) {
                System.out.println("Oh boy! Things are really bad! " + e2.getMessage());
            }
        } finally {
            try {
                System.out.println("Resetting default commit behavior");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Couldn't reset auto-commit! " + e.getMessage());
            }
        }
    }
}