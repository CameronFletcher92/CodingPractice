package ch09_recursion_and_dynamic_programming;

public class Q3 {
    private static int findMagicIndex(int[] array, int start, int end) {
        // base case: no magic index found
        if (start > end || start < 0 || end > (array.length - 1)) {
            return -1;
        }

        // get the mid index and mid value
        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];

        // base case: magic index found
        if (midValue == midIndex) {
            return midIndex;
        }

        // search left
        int newEnd = Math.min(midValue, midIndex - 1);
        int leftVal = findMagicIndex(array, start, newEnd);
        if (leftVal >= 0) {
            return leftVal;
        }

        // search right
        int newStart = Math.max(midValue, midIndex + 1);
        return findMagicIndex(array, newStart, end);
    }


    public static int findMagicIndex(int[] array) {
        // use a binary search, starting at half way point
        return findMagicIndex(array, 0, array.length - 1);
    }


}
