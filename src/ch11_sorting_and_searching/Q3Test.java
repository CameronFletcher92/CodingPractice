package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q3Test extends TestCase {
    public void testFindInt() throws Exception {
        int[] arr = new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};

        assertEquals(0, Q3.find(arr, 15));
        assertEquals(1, Q3.find(arr, 16));
        assertEquals(2, Q3.find(arr, 19));
        assertEquals(3, Q3.find(arr, 20));
        assertEquals(4, Q3.find(arr, 25));
        assertEquals(5, Q3.find(arr, 1));
        assertEquals(6, Q3.find(arr, 3));
        assertEquals(7, Q3.find(arr, 4));
        assertEquals(8, Q3.find(arr, 5));
        assertEquals(9, Q3.find(arr, 7));
        assertEquals(10, Q3.find(arr, 10));
        assertEquals(11, Q3.find(arr, 14));

        arr = new int[]{2, 2, 2, 3, 4, 2};
        assertEquals(3, Q3.find(arr, 3));
        assertEquals(4, Q3.find(arr, 4));
    }

}