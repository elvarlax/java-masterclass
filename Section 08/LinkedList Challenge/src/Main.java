import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        /*
        Create a program that implements a playlist for songs
        Create a Song class having Title and Duration for a song.
        The program will have a Album class containing a list of songs.
        The albums will be stored in an ArrayList.
        Songs from different albums can be added to the playlist and will appear
        in the list in the order they are added.
        Once the songs have been added to the playlist, create a menu of options to :-
        Quit, Skip forward to the next song, skip backwards to a previous song.
        Replay the current song. List the songs in the playlist.
        A song must exist in an album before it can be added to
        the playlist (so you can only play songs that you own).
        Hint: To replay a song, consider what happened when we
        went back and forth from a city before we started
        tracking the direction we were going.
        As an optional extra, provide an option to remove the current song from
        the playlist (hint: listIterator.remove())
        */
        Album album = new Album("One Hot Minute", "Red Hot Chili Peppers");
        album.addSong("Warped", 5.04);
        album.addSong("Aeroplane", 4.45);
        album.addSong("Deep Kick", 6.33);
        album.addSong("My Friends", 4.02);
        album.addSong("Coffee Shop", 3.08);
        album.addSong("Pea", 1.47);
        album.addSong("One Big Mob", 6.02);
        album.addSong("Walkabout", 5.07);
        album.addSong("Tearjerker", 4.19);
        album.addSong("One Hot Minute", 6.23);
        album.addSong("Falling into Grace", 3.48);
        album.addSong("Shallow Be Thy Game", 4.33);
        album.addSong("Transcending", 5.46);
        albums.add(album);

        album = new Album("Californication", "Red Hot Chili Peppers");
        album.addSong("Around the World", 3.58);
        album.addSong("Parallel Universe", 4.30);
        album.addSong("Scar Tissue", 3.37);
        album.addSong("Otherside", 4.15);
        album.addSong("Get on Top", 3.18);
        album.addSong("Californication", 5.21);
        album.addSong("Easily", 3.51);
        album.addSong("Porcelain", 2.43);
        album.addSong("Emit Remmus", 4.00);
        album.addSong("I Like Dirt", 2.37);
        album.addSong("This Velvet Glove", 3.45);
        album.addSong("Savior", 4.52);
        album.addSong("Purple Stain", 4.13);
        album.addSong("Right on Time", 1.52);
        album.addSong("Road Trippin'", 3.25);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("My Friends", playList);
        albums.get(0).addToPlayList("Aeroplane", playList);
        albums.get(0).addToPlayList("Dark Road", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(17, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = true;
                    } else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available actions.\n" +
                "6 - remove current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}
