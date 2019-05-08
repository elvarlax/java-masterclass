import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("This test has not been implemented");
    }
}