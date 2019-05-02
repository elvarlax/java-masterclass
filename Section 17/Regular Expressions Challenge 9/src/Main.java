import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        Let's suppose we're reading strings that match the patterns we used in challenges 7 and 8 from a file.
        Tabs are used to separate the matches, with one exception.
        The last match is followed by a newline.
        Revise the regular expression accordingly and extract all the numbers, as we did in challenge 8.
        */
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("\\w+\\.(\\d+)\\s");
        Matcher matcher = pattern.matcher(challenge9);

        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
