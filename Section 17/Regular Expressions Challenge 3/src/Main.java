import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*
        In the last challenge, we used the same regular expression twice.
        Use the Matcher.matches() method to check for matches,
        instead of String.matches(), for the regular expression that uses \w+.
        Hint: You'll have to compile a pattern.
        */
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        Pattern pattern = Pattern.compile("I want a (bike|ball).");
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
    }
}
