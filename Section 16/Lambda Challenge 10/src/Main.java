import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Now do the same thing (uppercase first letter, then sort and print the list)
        using a stream and a chain of stream operations.
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

        topNames2015
                .stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}
