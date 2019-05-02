public class Main {

    public static void main(String[] args) {
        /*
        Write a regular expression that will match a string that starts with a series of letters.
        The letters must be followed by a period.
        After the period, there must be a series of digits.
        The string "kjisl.22" would match.
        The string "f5.12a" would not.
        Use this string to test your regular expression.
        */
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^\\w+\\.\\d+$"));
    }
}
