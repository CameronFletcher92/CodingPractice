package ch01_arrays_and_strings;

public class Q5 {
    public static String compress(String str) {
        char[] chars = str.toCharArray();
        if (chars.length == 0) {
            return str;
        }

        char last = chars[0];
        int lastCount = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == last) {
                lastCount++;
            } else {
                compressed.append(last);
                compressed.append(lastCount);

                last = chars[i];
                lastCount = 1;
            }
        }

        // append the last char still
        compressed.append(last);
        compressed.append(lastCount);

        if (compressed.length() < str.length()) {
            return compressed.toString();
        } else {
            return str;
        }
    }
}
