package ch1_arrays_and_strings;

public class Q1 {
    public static boolean hasUniqueChars(String str) {
        // only 256 possible chars assuming ascii
        if (str.length() > 256) {
            return false;
        }

        // array of booleans to detect duplicates
        boolean[] charSet = new boolean[256];
        for (char c : str.toCharArray()) {
            if (charSet[c]) {
                return false;
            } else {
                charSet[c] = true;
            }
        }

        return true;
    }
}
