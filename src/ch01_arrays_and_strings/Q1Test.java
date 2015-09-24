package ch01_arrays_and_strings;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;

public class Q1Test extends TestCase {

    public void testHasUniqueChars() throws Exception {
        assertTrue(Q1.hasUniqueChars("abcde"));
        assertFalse(Q1.hasUniqueChars("aaaa"));
        assertTrue(Q1.hasUniqueChars("ab cde"));
        assertFalse(Q1.hasUniqueChars("ab c de"));
        assertTrue(Q1.hasUniqueChars("123 4567890"));
        assertTrue(Q1.hasUniqueChars("ABC DEF12@#$"));
        assertFalse(Q1.hasUniqueChars("@ABC DEF12@#$"));


        // random test of pair indexes
        int[] arr = new int[]{1, 4, 1, 5, 0, -1, 6, 1};

        // expected pairs summing to 5:
        // (0, 1), (1, 2), (3, 4), (5, 6), (1, 7)
        ArrayList<int[]> result = getPairIndexes(arr, 5);
        assertEquals(5, result.size());
    }

    private ArrayList<int[]> getPairIndexes(int[] arr, int target) {
        ArrayList<int[]> result = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> valueMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // see if the hashmap contains keys for target - arr[i]
            if (valueMap.containsKey(target - arr[i])) {
                for (int index : valueMap.get(target - arr[i])) {
                    result.add(new int[]{index, i});
                }
            }

            // add ourselves to the hashmap
            if (valueMap.containsKey(arr[i])) {
                valueMap.get(arr[i]).add(i);
            } else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(i);
                valueMap.put(arr[i], newList);
            }
        }

        return result;
    }
}