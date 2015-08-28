package ch11_sorting_and_searching;

public class Q3 {
    public static int find(int[] arr, int val) {
        return find(val, arr, 0, arr.length - 1);
    }

    private static int find(int val, int[] arr, int start, int end) {
        // not found
        if (start > end) {
            return -1;
        }

        // base case
        int mid = (start + end) / 2;
        int midVal = arr[mid];
        if (midVal == val) {
            return mid;
        }

        // general case
        int startVal = arr[start];
        int endVal = arr[end];

        // left is sorted
        if (startVal < midVal) {
            // if value is in the sorted range left: search left
            if (startVal <= val && val < midVal) {
                return find(val, arr, start, mid - 1);
            }

            // value is not in the sorted range left: search right
            else {
                return find(val, arr, mid + 1, end);
            }
        }

        // right is sorted
        else if (startVal > midVal) {
            // if value is in the sorted range right: search right
            if (midVal < val && val <= endVal) {
                return find(val, arr, mid + 1, end);
            }

            // value is not in the sorted range right: search left
            else {
                return find(val, arr, start, mid - 1);
            }
        }

        // left is a dup: check if right is also a dup
        else {
            // right is not a dup: search right
            if (midVal != endVal) {
                return find(val, arr, mid + 1, end);
            }

            // right is a dup: search both trees
            else {
                int result = find(val, arr, start, mid - 1);
                if (result > -1) return result;

                result = find(val, arr, mid + 1, end);
                return result;
            }
        }
    }

}
