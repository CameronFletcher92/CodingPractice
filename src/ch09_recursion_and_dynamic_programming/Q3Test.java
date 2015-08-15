package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

public class Q3Test extends TestCase {
    public void testFindMagicIndex() throws Exception {
        int[] array = new int[] {1, 2, 5, 5, 5, 5, 7, 9, 11 };
        assertEquals(5, Q3.findMagicIndex(array));

        array = new int[] {-5, -4, -3, -2, -1, 5, 10};
        assertEquals(5, Q3.findMagicIndex(array));

        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1, Q3.findMagicIndex(array));

        array = new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};
        assertEquals(0, Q3.findMagicIndex(array));

    }

}