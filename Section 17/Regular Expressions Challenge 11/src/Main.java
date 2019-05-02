import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        Suppose we have the following string containing points on a graph within curly braces.
        Extract what's in the curly braces.
        */
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern = Pattern.compile("\\{(\\d, \\d)\\}");
        Matcher matcher = pattern.matcher(challenge11);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
