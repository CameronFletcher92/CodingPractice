package ch02_linked_lists;
import junit.framework.TestCase;

public class Q7Test extends TestCase {
    public void testIsPalindrome() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(1);

        assertTrue(Q7.isPalindrome(list));

        list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(3);
        list.append(2);
        list.append(1);

        assertTrue(Q7.isPalindrome(list));

        list.append(1);

        assertFalse(Q7.isPalindrome(list));
    }
}