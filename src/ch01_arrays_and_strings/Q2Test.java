package ch01_arrays_and_strings;
import junit.framework.TestCase;

public class Q2Test extends TestCase {

    public void testReverse() throws Exception {
        assertEquals("dcba", Q2.reverse("abcd"));
        assertEquals("abcd", Q2.reverse("dcba"));
        assertEquals("aaaaaaaa", Q2.reverse("aaaaaaaa"));
        assertEquals("aaaaaaaab", Q2.reverse("baaaaaaaa"));
    }
}