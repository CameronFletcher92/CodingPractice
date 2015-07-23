package ch01_arrays_and_strings;

public class Q5 {
    public static String compress(String str) {
        StringBuffer buff = new StringBuffer();
        Character lastLetter = null;
        int letterCount = 0;

        for (Character c : str.toCharArray()) {
            if (lastLetter != null && c != lastLetter) {
                buff.append("" + lastLetter + letterCount);
                letterCount = 0;
            }
            lastLetter = c;
            letterCount++;
        }

        // last letter
        buff.append("" + lastLetter + letterCount);

        if (buff.length() >= str.length()) {
            return str;
        } else {
            return buff.toString();
        }
    }
}
