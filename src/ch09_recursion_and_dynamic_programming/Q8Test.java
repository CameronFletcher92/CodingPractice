package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

public class Q8Test extends TestCase {
    public void testCountWays() throws Exception {
        assertEquals(2, Q8.makeChange(5));
        assertEquals(4, Q8.makeChange(10));
        assertEquals(13, Q8.makeChange(25));
        assertEquals(24, Q8.makeChange(35));
    }
}