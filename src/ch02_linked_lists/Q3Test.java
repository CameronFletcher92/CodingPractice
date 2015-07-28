package ch02_linked_lists;
import junit.framework.TestCase;

public class Q3Test extends TestCase {
    public void testDeleteNode() throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // get the '3' node
        LinkedList.Node node = list.head.next.next;
        Q3.deleteNode(node);

        assertEquals(4, list.length());

        assertEquals(1, (int)list.head.data);
        assertEquals(2, (int)list.head.next.data);
        assertEquals(4, (int)list.head.next.next.data);
        assertEquals(5, (int)list.head.next.next.next.data);
    }
}