import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Let's go back to the previous version of the code,
        when we were printing out the sorted names.
        Let's suppose we want to debug what's going on when the chain is executed.

        Instead of printing out the names at the end of the chain, maybe we're not sure
        the code that uppercases the first letter is working correctly.

        Let's use peek() to print out the names after the map() method has executed.
        What will the following code print to the console?
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
                .sorted(String::compareTo);

        // Nothing will be printed out.
    }
}
