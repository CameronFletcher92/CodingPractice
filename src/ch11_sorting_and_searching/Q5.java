package ch11_sorting_and_searching;

public class Q5 {
    private static int findString(String[] words, String word, int start, int end) {
        int mid = (start + end) / 2;
        int altMid = mid;

        // move forward until we hit a word
        while (words[altMid].equals("") && altMid < end) {
            altMid++;
        }

        // no match found (only empty strings)
        if (altMid == end) {
            return -1;
        }

        // base case
        if (words[altMid].equals(word)) {
            return altMid;
        }

        // search before
        if (words[altMid].compareTo(word) > 0) {
            return findString(words, word, start, mid - 1);
        }

        // search after
        if (words[altMid].compareTo(word) < 0) {
            return findString(words, word, mid + 1, end);
        }

        return -1;

    }

    public static int findString(String[] words, String word) {
        return findString(words, word, 0, words.length - 1);
    }
}
