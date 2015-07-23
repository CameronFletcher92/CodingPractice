package ch1_arrays_and_strings;
import junit.framework.TestCase;

public class Q5Test extends TestCase {

    public void testCompress() throws Exception {
        assertEquals("a2b1c5a3", Q5.compress("aabcccccaaa"));
        assertEquals("abc", Q5.compress("abc"));
        assertEquals("a1b5c1", Q5.compress("abbbbbc"));
    }
}