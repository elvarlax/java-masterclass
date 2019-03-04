import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        return this.songs.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (!this.songs.contains(song)) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }
    }
}
