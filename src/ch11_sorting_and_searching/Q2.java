package ch11_sorting_and_searching;

import java.util.HashMap;
import java.util.LinkedList;

public class Q2 {
    private static int partition(char[] chars, int start, int end) {
        char pivot = chars[(start + end) / 2];

        while (start <= end) {
            // get to the first elem on left that should be moved
            while (chars[start] < pivot) {
                start++;
            }

            // get to the first elem on the right that should be moved
            while (chars[end] > pivot) {
                end--;
            }

            // swap the elements and move left and right indices
            if (start <= end) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;

                start++;
                end--;
            }

        }

        start -= 1;
        return start;
    }

    private static void quickSortChars(char[] chars, int start, int end) {
        int index = partition(chars, start, end);

        // sort left
        if (start < index) {
            quickSortChars(chars, start, index);
        }

        // sort right
        if (index + 1 < end) {
            quickSortChars(chars, index + 1, end);
        }
    }

    private static String quickSortString(String str) {
        char[] chars = str.toCharArray();
        quickSortChars(chars, 0, str.length() - 1);
        return new String(chars);
    }


    private static String bubbleSortString(String str) {
        char[] chars = str.toCharArray();
        char tmp;
        int swaps;

        do {
            swaps = 0;
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] > chars[i + 1]) {
                    tmp = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = tmp;
                    swaps++;
                }
            }
        } while (swaps > 0);

        return new String(chars);
    }

    public static void sortAnagrams(String[] words) {
        // create a hashmap of alphabetical -> list of anagrams
        HashMap<String, LinkedList<String>> map = new HashMap<>();

        // create the hashmap
        for (String word: words) {
            String sorted = quickSortString(word);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);
            } else {
                LinkedList<String> anagrams = new LinkedList<>();
                anagrams.add(word);
                map.put(sorted, anagrams);
            }
        }

        // construct the array
        int index = 0;
        for (LinkedList<String> group : map.values()) {
            for (String word : group) {
                words[index] = word;
                index++;
            }
        }
    }
}
