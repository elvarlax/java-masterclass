public class Main {

    public static void main(String[] args) {
        /*
        Write a regular expression that will match 5-digit US zip codes,
        and zip codes that contain the optional 4 digits preceded by a dash.
        */
        String challenge14_1 = "11111";
        String challenge14_2 = "11111-1111";
        String zipRegExp = "^\\d{5}|\\d{5}-\\d{4}$";
        System.out.println(challenge14_1.matches(zipRegExp));
        System.out.println(challenge14_2.matches(zipRegExp));
    }
}
