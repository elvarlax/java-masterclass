public class Main {

    public static void main(String[] args) {
        /*
        We wouldn't stop with the two tests we've run.
        Now it's time for you to come up with two more tests
        that don't test the same functionality as the existing tests.
        Take a look at the code, and see if you can think of another string
        we should pass to test a specific part of the code.

        There's also another special input value that we'd want to test,
        and which will reveal another bug in our code.
        You don't have to write the tests,
        just think of what the inputs and expected outputs would be.
        */
        Utilities utils = new Utilities();
        System.out.println(utils.removePairs("AABCDDEFF"));
        System.out.println(utils.removePairs("ABCCABDEEF"));
        System.out.println(utils.removePairs("A"));
        System.out.println(utils.removePairs(""));
        System.out.println(utils.removePairs(null));
    }
}
