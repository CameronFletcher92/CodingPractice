package ch02_linked_lists;
import junit.framework.TestCase;

public class Q4Test extends TestCase {
    public void testPartition() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list = Q4.partition(list, 3);
        assertTrue((int)list.head.data < 3);
        assertTrue((int)list.head.next.data < 3);
        assertTrue((int)list.head.next.next.data >= 3);
        assertTrue((int)list.head.next.next.next.data >= 3);
        assertTrue((int)list.head.next.next.next.next.data >= 3);
    }

}