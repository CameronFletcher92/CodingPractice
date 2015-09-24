package ch01_arrays_and_strings;

public class Q4 {
    public static String replaceSpaces(char[] chars, int length) {
        // count the spaces
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }
        }

        int end = length + (2 * spaces) - 1;

        // iterate backwards from newLength, copying chars, or replacing spaces
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[end] = '0';
                chars[end - 1] = '2';
                chars[end - 2] = '%';
                end -= 3;
            } else {
                chars[end] = chars[i];
                end -= 1;
            }
        }

        return new String(chars);
    }
}
