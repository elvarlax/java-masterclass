public class Main {

    public static void main(String[] args) {
        /*
        Write a regular expression that will only match the challenge 5 string in its entirety.
        */
        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));
    }
}
