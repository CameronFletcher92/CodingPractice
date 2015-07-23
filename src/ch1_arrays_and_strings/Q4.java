package ch1_arrays_and_strings;

public class Q4 {
    public static String replaceSpaces(char[] chars, int length) {
        int spaceCount = 0;

        // count the spaces
        for (int i = 0; i < (length - 1); i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }


        // work backwards, replacing spaces as we go
        int end = (length + (spaceCount * 2) - 1);
        for (int i = (length - 1); i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[end - 2] = '%';
                chars[end - 1] = '2';
                chars[end] = '0';
                end -= 3;
            } else {
                chars[end] = chars[i];
                end -= 1;
            }
        }

        // return the new string
        return new String(chars);
    }
}
