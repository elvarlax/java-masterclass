import static junit.framework.TestCase.*;

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
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
        assertNull(util.removePairs(null));
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