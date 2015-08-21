package ch11_sorting_and_searching;

public class Q3 {
    public static int binarySearch(int[] arr, int num, int start, int end) {
        int mid = (start + end) / 2;

        // found the index
        if (arr[mid] == num) {
            return mid;
        }

        // search left
        if (num < arr[mid]) {
            return binarySearch(arr, num, start, mid - 1);

        }

        // search right
        if (num > arr[mid]) {
            return binarySearch(arr, num, mid + 1, end);
        }

        return -1;
    }

    public static int simpleSearch(int[] arr, int num, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static int findInt(int[] arr, int num) {
        int startVal = arr[0];
        int end = arr.length - 1;
        int endVal = arr[end];
        int mid = end / 2;
        int midVal = arr[mid];


        // determine whether the rotation point is on the left or the right
        if (midVal >= startVal) {
            // left side is sorted: check if num is in the sorted part
            if (num >= startVal && num <= midVal) {
                return binarySearch(arr, num, 0, mid);
            } else {
                return simpleSearch(arr, num, mid, end);
            }
        } else if (midVal <= endVal) {
            // right side is sorted: check if num is in the sorted part
            if (num >= midVal && num <= endVal) {
                return binarySearch(arr, num, mid, end);
            } else {
                return simpleSearch(arr, num, 0, mid);
            }
        }

        return -1;
    }
}
