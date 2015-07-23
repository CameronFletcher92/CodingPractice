package ch01_arrays_and_strings;
import junit.framework.TestCase;

public class Q8Test extends TestCase {

    public void testIsRotation() throws Exception {
        assertTrue(Q8.isRotation("waterbottle", "erbottlewat"));
        assertFalse(Q8.isRotation("waterbottle", "erbottlewtt"));
        assertFalse(Q8.isRotation("waterbtotle", "erbottlewat"));
    }
}