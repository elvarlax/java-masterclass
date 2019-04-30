import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*
        Add a terminal operation to this chain so that the peek call will execute.

        If you need to, check the Stream documentation at
        https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

        Since the peek() call is printing every item, try to do something else with
        the terminal operation. Don't print out the items again.
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
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
