package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.util.HashSet;

public class Q6Test extends TestCase {
    public void testGetValidParens() throws Exception {
        HashSet<String> parens = Q6.getValidParens(3);
        assertTrue(parens.size() == 5);
        assertTrue(parens.contains("((()))"));
        assertTrue(parens.contains("(()())"));
        assertTrue(parens.contains("(())()"));
        assertTrue(parens.contains("()(())"));
        assertTrue(parens.contains("()()()"));
    }
}