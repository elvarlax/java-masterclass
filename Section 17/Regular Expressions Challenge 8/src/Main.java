import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        Modify the regular expression in challenge 7 to use a group,
        so that we can print all the digits that occur in a string
        that contains multiple occurrences of the pattern.
        Write all the code required to accomplish this (create a pattern and matcher, etc.).

        There are three occurrences of the pattern we looked for in challenge #7.
        When you run your code, you should see 135, 7, and 999 printed to the console.
        */
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern = Pattern.compile("\\w+\\.(\\d+)");
        Matcher matcher = pattern.matcher(challenge8);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
