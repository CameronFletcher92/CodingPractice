package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testMergeInto() throws Exception {
        int[] a1 = new int[]{1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int[] a2 = new int[]{2, 4, 6, 8, 10};

        int[] merged = Q1.mergeInto(a1, 5, a2);
        for (int i = 0; i < 10; i++) {
            assertEquals(i + 1, merged[i]);
        }

        a1 = new int[]{1, 3, 5, 7, 10, 11, 12, 0, 0, 0};
        a2 = new int[]{1, 1, 1};

        merged = Q1.mergeInto(a1, 7, a2);
        assertEquals(1, merged[0]);
        assertEquals(1, merged[1]);
        assertEquals(1, merged[2]);
        assertEquals(1, merged[3]);
        assertEquals(3, merged[4]);
        assertEquals(5, merged[5]);
        assertEquals(7, merged[6]);
        assertEquals(10, merged[7]);
        assertEquals(11, merged[8]);
        assertEquals(12, merged[9]);
    }

}