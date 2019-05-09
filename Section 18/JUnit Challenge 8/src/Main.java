public class Main {

    public static void main(String[] args) {
        /*
        Now write a test for the converter() method that tests the following scenario.
        You can add the test to the existing test method, or create a new one.
        Input: a = 10, b = 0
        Output: ArithmeticException (divide by 0)
        */
        Utilities util = new Utilities();
        System.out.println(util.converter(10, 0));
    }
}
