import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Instead of printing out the sorted names,
        print out how many names being with the letter 'A' instead.

        Two hints:
        1. You'll have to modify the stream chain
        2. You'll have to add another statement to print the number of items
        */
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        long namesBeginWithA = topNames2015
                .stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A is: " + namesBeginWithA);
    }
}
