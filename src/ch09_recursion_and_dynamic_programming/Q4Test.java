package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q4Test extends TestCase {
    public void testGetAllSets() throws Exception {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        assertEquals(8, Q4.getAllSets(nums).size());
        assertEquals(8, Q4.setOfSets(nums).size());
    }
}