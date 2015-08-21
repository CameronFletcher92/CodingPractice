package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q5Test extends TestCase {
    public void testFindString() throws Exception {
        String[] words = new String[] {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        assertEquals(0, Q5.findString(words, "at"));
        assertEquals(4, Q5.findString(words, "ball"));
        assertEquals(10, Q5.findString(words, "dad"));
        assertEquals(-1, Q5.findString(words, "poop"));
    }

}