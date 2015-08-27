package ch09_recursion_and_dynamic_programming;

import java.util.LinkedList;

public class Q5 {
    public static LinkedList<String> getPerms(String str) {
        LinkedList<String> perms;

        // base case
        if (str.length() == 0) {
            perms = new LinkedList<>();
            perms.add(str);
            return perms;
        }

        // general case
        // take the first letter
        char first = str.charAt(0);
        String rest = str.substring(1);

        // get perms of smaller string
        perms = getPerms(rest);

        // add first at every possible position in every perm
        int size = perms.size();
        for (int i = 0; i < size; i++) {
            String perm = perms.removeFirst();
            for (int j = 0; j <= perm.length(); j++) {
                String newPerm = insertCharAt(perm, first, j);
                perms.add(newPerm);
            }
        }

        return perms;
    }

    private static String insertCharAt(String str, char c, int index) {
        return str.substring(0, index) + c + str.substring(index);
    }
}
