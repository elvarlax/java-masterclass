import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        Instead of printing out the numbers themselves, print out their start and end indices.
        Use the same string we used for challenge 9.
        Make those indices inclusive. For example, the start index printed for 135 should be 5,
        and the end index should be 7. Hint: You will need to look at the documentation for the
        Matcher.start() and Matcher.end()  methods. There's more than one version of these methods.
        The documentation is here: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
        */
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("\\w+\\.(\\d+)\\s");
        Matcher matcher = pattern.matcher(challenge10);

        while (matcher.find()) {
            System.out.println("Occurrence: start = " + matcher.start(1) + " end = " + (matcher.end(1) - 1));
        }
    }
}
