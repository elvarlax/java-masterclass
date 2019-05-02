public class Main {

    public static void main(String[] args) {
        /*
        US zip codes can be followed by a dash and another four numbers.
        Write a regular expression that will match those zip codes.
        Use "11111-1111" as your test string.
        */
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));
    }
}
