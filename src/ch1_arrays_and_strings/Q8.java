package ch1_arrays_and_strings;

public class Q8 {
    public static boolean isRotation(String str1, String str2) {
        // rotations must be same length
        if (str1.length() == str2.length()) {
            // duplicate string 1 in a buffer
            StringBuffer buff = new StringBuffer();
            buff.append(str1);
            buff.append(str1);

            // if duplicated string 1 contains string 2, and the lengths were the same, it must be a rotation
            if (buff.toString().contains(str2)) {
                return true;
            }
        }

        return false;
    }
}
