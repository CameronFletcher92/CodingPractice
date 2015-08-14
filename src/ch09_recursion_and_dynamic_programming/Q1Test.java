package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testCountWays() throws Exception {
        assertEquals(4, Q1.countWays(3));
        assertEquals(2, Q1.countWays(2));
    }
}