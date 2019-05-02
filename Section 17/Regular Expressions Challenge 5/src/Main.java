public class Main {

    public static void main(String[] args) {
        /*
        Write a regular expression that will match the following string in its entirety.
        Use the String.matches() method to verify your answer.
        */
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));
    }
}
