package ch01_arrays_and_strings;

public class Q3 {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] counts = new int[256];

        // populate the counts array
        for (char c : str1.toCharArray()) {
            counts[c]++;
        }

        // subtract as each character is hit and ensure it doesn't go below 0
        for (char c : str2.toCharArray()) {
            counts[c]--;
            if (counts[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
