package ch02_linked_lists;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testRemoveDups() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        assertEquals(4, list.length());
        Q1.removeDups(list);
        assertEquals(4, list.length());

        list = new LinkedList<>();
        list.append(1);
        list.append(1);
        list.append(2);
        list.append(2);

        assertEquals(4, list.length());
        Q1.removeDups(list);
        assertEquals(2, list.length());
    }

    public void testRemoveDups2() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        assertEquals(4, list.length());
        Q1.removeDups2(list);
        assertEquals(4, list.length());

        list = new LinkedList<>();
        list.append(1);
        list.append(1);
        list.append(2);
        list.append(2);

        assertEquals(4, list.length());
        Q1.removeDups2(list);
        assertEquals(2, list.length());
    }
}