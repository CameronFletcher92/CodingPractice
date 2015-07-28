package ch02_linked_lists;
import junit.framework.TestCase;

public class Q2Test extends TestCase {
    public void testFindKthLast() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        assertEquals(3, (int)Q2.findKthLast(list, 2));
        assertEquals(1, (int)Q2.findKthLast(list, 4));
    }
}