public class Main {

    public static void main(String[] args) {
        /*
        Now write a regular expression that will match "I want a bike." and "I want a ball."
        Verify your answer using the matches() method.
        */
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        String regExp = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));
    }
}
