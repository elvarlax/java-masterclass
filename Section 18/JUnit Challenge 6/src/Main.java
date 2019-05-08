public class Main {

    public static void main(String[] args) {
        /*
        Now write two tests for the nullIfOddLength() method.
        Include both tests in the nullIfOddLength() test method.
        In one test, pass an String that has an even length,
        and in the second test, pass an String that has an odd length.
        */
        Utilities util = new Utilities();
        System.out.println(util.nullIfOddLength("odd"));
        System.out.println(util.nullIfOddLength("even"));
    }
}
