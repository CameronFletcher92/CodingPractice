package ch1_arrays_and_strings;
import junit.framework.TestCase;

public class Q3Test extends TestCase {

    public void testReverse() throws Exception {
        assertTrue(Q3.isPermutation("abcdef", "fdecab"));
        assertTrue(Q3.isPermutation("race car", "car race"));
        assertTrue(Q3.isPermutation("122333444455555", "132434525453545"));

        assertFalse(Q3.isPermutation("123", "423"));
        assertFalse(Q3.isPermutation("123456", "6543211"));
        assertFalse(Q3.isPermutation("1123456", "654321"));
        assertFalse(Q3.isPermutation("abcc", "abccc"));
        assertFalse(Q3.isPermutation("abccc", "a"));

        assertFalse(Q3.isPermutation("aaaabba", "aaabbba"));
    }
}