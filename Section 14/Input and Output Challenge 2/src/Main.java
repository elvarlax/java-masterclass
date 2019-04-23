import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        /*
        Part 1:
        Modify the program so that it uses a BufferedReader to read in the locations data.

        Run the program to test it before moving on to Part 2.

        Part 2:
        Modify the main method of the Locations class so that is uses a
        BufferedWriter to write the data.

        Open the locations.txt and directions.txt files to check that the
        data has been written successfully.

        You will then need to make another change to the program to allow
        for the 0 (Quit) exits before using the newly created files.

        Hint: You may want to change the three instances of HashMap to
        LinkedHashMap in the Location class and one instance in the
        Locations class so that you can compare the files more easily.
        */
        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
