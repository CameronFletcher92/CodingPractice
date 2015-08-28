package ch11_sorting_and_searching;

public class Q5 {
    private static int findString(String[] words, String word, int start, int end) {
        // base case: not found
        if (start > end) {
            return -1;
        }

        int oldMid = (start + end) / 2;
        int mid = oldMid;

        // step back until we find a string
        while (mid > start && words[mid].isEmpty()) {
            mid--;
        }

        // base case: found the word
        if (words[mid].equals(word)) {
            return mid;
        }

        // general case
        // if there were no strings on the left of mid, or word > words[mid], search right (from oldMid)
        if (words[mid].isEmpty() || words[mid].compareTo(word) < 0) {
            return findString(words, word, oldMid + 1, end);
        }

        // search left otherwise
        else {
            return findString(words, word, start, mid - 1);
        }
    }

    public static int findString(String[] words, String word) {
        return findString(words, word, 0, words.length - 1);
    }
}
