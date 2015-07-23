package ch1_arrays_and_strings;
import junit.framework.TestCase;

public class Q1Test extends TestCase {

    public void testHasUniqueChars() throws Exception {
        assertTrue(Q1.hasUniqueChars("abcde"));
        assertFalse(Q1.hasUniqueChars("aaaa"));
        assertTrue(Q1.hasUniqueChars("ab cde"));
        assertFalse(Q1.hasUniqueChars("ab c de"));
        assertTrue(Q1.hasUniqueChars("123 4567890"));
        assertTrue(Q1.hasUniqueChars("ABC DEF12@#$"));
        assertFalse(Q1.hasUniqueChars("@ABC DEF12@#$"));
    }
}