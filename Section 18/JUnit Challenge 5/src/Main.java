public class Main {

    public static void main(String[] args) {
        /*
        Write a test that tests the case when the value of n is greater then the length of the string.
        You can add a new test case, or you can add the test to the existing test case.
        */
        Utilities util = new Utilities();
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(util.everyNthChar(array, 6));
    }
}
