package ch01_arrays_and_strings;

import java.util.BitSet;

public class Q1 {
    public static boolean hasUniqueChars(String str) {
        char[] chars = str.toCharArray();

        if (chars.length > 256) {
            return false;
        }

        // check uniqueness using bitset
        BitSet bs = new BitSet(256);
        for (char c : chars) {
            if (bs.get(c)) {
                return false;
            } else {
                bs.set(c);
            }
        }

        return true;
    }
}
