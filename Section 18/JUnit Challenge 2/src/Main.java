public class Main {

    public static void main(String[] args) {
        /*
        In this challenge, you'll create tests for the Utilities.removePairs() method.
        This method accepts a string and removes any pairs it contains by removing one half of the pair.
        For example:

        Input:  AABCDDEFF
        Output: ABCDEF

        Input:  ABCCABDEEF
        Output: ABCABDEF

        Write the test code that tests the above two scenarios.
        Start by writing a test for the first set of input/output.
        Once that test passes, add a test for the second input/output pair.
        To keep things simple, you can add the second test to the same test method,
        but if you want to be strict about it, you can create another test method for it.
        */
        Utilities utils = new Utilities();
        System.out.println(utils.removePairs("AABCDDEFF"));
        System.out.println(utils.removePairs("ABCCABDEEF"));
    }
}
