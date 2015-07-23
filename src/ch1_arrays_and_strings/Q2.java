package ch1_arrays_and_strings;

public class Q2 {
    public static String reverse(String str) {
        StringBuffer buff = new StringBuffer();
        for (char c : str.toCharArray()) {
            buff.insert(0, c);
        }
        return buff.toString();
    }
}
