package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.util.Arrays;

public class Q7Test extends TestCase {
    public void testFill() throws Exception {
        Q7.Color[][] screen = new Q7.Color[][] {
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Blue, Q7.Color.Blue, Q7.Color.Blue, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Blue, Q7.Color.Blue, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Blue, Q7.Color.Blue, Q7.Color.Blue, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red }
        };

        Q7.fill(screen, 1, 1, Q7.Color.Green);

        Q7.Color[][] expected = new Q7.Color[][] {
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Green, Q7.Color.Green, Q7.Color.Green, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Green, Q7.Color.Green, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Green, Q7.Color.Green, Q7.Color.Green, Q7.Color.Red },
                new Q7.Color[] { Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red, Q7.Color.Red }
        };

        assertTrue(Arrays.deepEquals(expected, screen));
    }
}