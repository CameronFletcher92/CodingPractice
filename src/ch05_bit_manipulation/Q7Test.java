package ch05_bit_manipulation;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q7Test extends TestCase {
    public void testFindMissingNumber() throws Exception {
        int[] nums = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 9};
        assertEquals(8, Q7.findMissingNumber(nums));
    }
}