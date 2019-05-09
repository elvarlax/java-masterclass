import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        Utilities util = new Utilities();
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(new char[]{'e', 'l'}, util.everyNthChar(array, 2));
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(array, 6));
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
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        Utilities util = new Utilities();
        assertEquals(300, util.converter(10, 0));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}