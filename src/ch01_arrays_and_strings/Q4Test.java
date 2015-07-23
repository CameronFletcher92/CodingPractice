package ch01_arrays_and_strings;
import junit.framework.TestCase;

public class Q4Test extends TestCase {

    public void testReplaceSpaces() throws Exception {
        assertEquals("Mr%20John%20Smith", Q4.replaceSpaces("Mr John Smith    ".toCharArray(), 13));
    }
}