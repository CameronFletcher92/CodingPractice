package ch09_recursion_and_dynamic_programming;

public class Q3 {
    private static int findMagicIndex(int[] array, int start, int end) {
        // magic index not found
        if (start > end || start < 0 || end >= array.length) {
            return -1;
        }

        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];

        // found the magic index
        if (midValue == midIndex) {
            return midIndex;
        }

        // search left
        int newEnd = Math.min(midIndex - 1, midValue);
        int left = findMagicIndex(array, start, newEnd);
        if (left >= 0) {
            return left;
        }

        // search right
        int newStart = Math.max(midIndex + 1, midValue);
        int right = findMagicIndex(array, newStart, end);
        return right;
    }

    public static int findMagicIndex(int[] array) {
        // use a binary search, starting at half way point
        return findMagicIndex(array, 0, array.length - 1);
    }


}
