package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

public class Q8Test extends TestCase {
    public void testCountWays() throws Exception {
        // old implementation
        assertEquals(2, Q8.makeChange(5));
        assertEquals(4, Q8.makeChange(10));
        assertEquals(13, Q8.makeChange(25));
        assertEquals(24, Q8.makeChange(35));

        // new implementation
        assertEquals(2, Q8.countWays(5));
        assertEquals(4, Q8.countWays(10));
        assertEquals(13, Q8.countWays(25));
        assertEquals(24, Q8.countWays(35));

        int ways1 = Q8.makeChange(500);
        int ways2 = Q8.countWays(500);
    }
}