package ch09_recursion_and_dynamic_programming;

import java.util.ArrayList;

public class Q5 {
    private static String insertCharAt(String str, int index, char c) {
        String start = str.substring(0, index);
        String end = str.substring(index);
        return start + c + end;
    }

    public static ArrayList<String> getPermutations(String original) {
        ArrayList<String> perms = new ArrayList<>();

        // base case, str length is 0
        if (original.length() == 0) {
            perms.add("");
            return perms;
        }

        char first = original.charAt(0);
        String remainder = original.substring(1);

        ArrayList<String> remainderPerms = getPermutations(remainder);
        for (String perm : remainderPerms) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = insertCharAt(perm, i, first);
                perms.add(newPerm);
            }
        }

        return perms;
    }
}
