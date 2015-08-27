package ch09_recursion_and_dynamic_programming;

import java.util.HashSet;

public class Q6 {
    private static String insertParensAfter(String str, int index) {
        String start = str.substring(0, index + 1);
        String end = str.substring(index + 1);
        return start + "()" + end;
    }

    // NEW IMPLEMENTATION
    public static HashSet<String> getValidParens2(int n) {
        HashSet<String> parens = new HashSet<>();

        // base case: n == 0
        if (n == 0) {
            parens = new HashSet<>();
            parens.add("");
            return parens;
        }

        // general case
        // get set of parens for n - 1
        HashSet<String> oldParens = getValidParens(n - 1);

        for (String str : oldParens) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    parens.add(insertParensAfter(str, i));
                }
            }
            // add the preceding
            parens.add(insertParensAfter(str, -1));
        }

        return parens;
    }

    // OLD IMPLEMENTATION
    public static HashSet<String> getValidParens(int pairs) {
        HashSet<String> parens = new HashSet<>();

        // base case: n = 1
        if (pairs == 1) {
            parens.add("()");
            return parens;
        }

        HashSet<String> existingParens = getValidParens(pairs - 1);
        for (String str : existingParens) {
            // insert the parens after every LParen
            int lParen = str.indexOf('(');
            while (lParen > -1) {
                parens.add(insertParensAfter(str, lParen));
                lParen = str.indexOf('(', lParen + 1);
            }

            // insert the parens before the entire string
            parens.add("()" + str);
        }

        return parens;
    }
}
