package ch01_arrays_and_strings;

import java.util.HashMap;

public class Q3 {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // build up a hashmap of the char counts
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        // deconstruct the hashmap using the second string
        for (char c : str2.toCharArray()) {
            if (!charMap.containsKey(c)) {
                return false;
            } else {
                charMap.put(c, charMap.get(c) - 1);

                // remove if the count reached 0
                if (charMap.get(c) == 0) {
                    charMap.remove(c);
                }
            }
        }

        return true;
    }
}
