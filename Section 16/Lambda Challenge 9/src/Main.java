import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Change the code so that is uses method references.
        Remember that a method reference looks like Class::MethodName
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

        List<String> firstNameUpperCase = new ArrayList<>();
        topNames2015.forEach(s -> firstNameUpperCase.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        firstNameUpperCase.sort(String::compareTo);
        firstNameUpperCase.forEach(System.out::println);
    }
}
