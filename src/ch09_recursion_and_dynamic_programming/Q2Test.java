package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.awt.Point;
import java.util.ArrayList;

public class Q2Test extends TestCase {
    private int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public void testCountWays() throws Exception {
        Q2.Location start = new Q2.Location(0, 0);

        Q2.Location end = new Q2.Location(1, 1);
        assertEquals(2, Q2.countWays(start, end));

        end = new Q2.Location(0, 1);
        assertEquals(1, Q2.countWays(start, end));

        end = new Q2.Location(1, 0);
        assertEquals(1, Q2.countWays(start, end));


        // complex answer
        end = new Q2.Location(5, 7);
        int expected = (factorial(end.x + end.y)) / (factorial(end.x) * factorial(end.y));
        assertEquals(expected, Q2.countWays(start, end));

        // second implementation (returns paths)
        ArrayList<ArrayList<Point>> paths = Q2.getWays(new Point(5, 7));
        assertEquals(expected, paths.size());
    }
}