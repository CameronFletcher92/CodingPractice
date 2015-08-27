package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q5Test extends TestCase {
    public void testGetPermutations() throws Exception {
        String original = "abc";
        LinkedList<String> perms = Q5.getPerms(original);

        assertEquals(6, perms.size());
        assertTrue(perms.contains("abc"));
        assertTrue(perms.contains("bca"));
    }


}