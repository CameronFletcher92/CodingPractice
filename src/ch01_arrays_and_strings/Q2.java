package ch01_arrays_and_strings;

public class Q2 {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        // swap while start < end
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;

            start++;
            end--;
        }

        return new String(chars);
    }
}
