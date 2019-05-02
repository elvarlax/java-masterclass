public class Main {

    public static void main(String[] args) {
        /*
        Write a regular expression that will match a 5-digit US zip code.
        Use "11111" as your test string.
        */
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));
    }
}
