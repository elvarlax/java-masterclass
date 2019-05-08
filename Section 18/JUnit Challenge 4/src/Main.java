public class Main {

    public static void main(String[] args) {
        /*
        Now write a test for the everyNthChar() method that tests the following scenario:
        Input: char array containing the letters 'h', 'e', 'l', 'l', 'o', in that order, and n = 2
        Output: char array containing the letters 'e', 'l', in that order
        */
        Utilities util = new Utilities();
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(util.everyNthChar(array, 2));
    }
}
