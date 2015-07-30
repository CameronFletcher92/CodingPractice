package ch02_linked_lists;
import junit.framework.TestCase;

public class Q5Test extends TestCase {
    public void testReverseSum() throws Exception {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(7);
        list1.append(1);
        list1.append(6);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(5);
        list2.append(9);
        list2.append(2);

        LinkedList<Integer> result = Q5.reverseSum(list1, list2);
        assertEquals(2, (int) result.head.data);
        assertEquals(1, (int) result.head.next.data);
        assertEquals(9, (int) result.head.next.next.data);
    }

    public void testSum() throws Exception {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.append(6);
        list1.append(1);
        list1.append(7);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(2);
        list2.append(9);
        list2.append(5);

        LinkedList<Integer> result = Q5.sum(list1, list2);
        assertEquals(9, (int)result.head.data);
        assertEquals(1, (int)result.head.next.data);
        assertEquals(2, (int)result.head.next.next.data);


        list1 = new LinkedList<>();
        list1.append(2);
        list1.append(3);
        list1.append(4);

        list2 = new LinkedList<>();
        list2.append(1);
        list2.append(0);
        list2.append(0);
        list2.append(0);

        result = Q5.sum(list1, list2);
        assertEquals(1, (int) result.head.data);
        assertEquals(2, (int) result.head.next.data);
        assertEquals(3, (int) result.head.next.next.data);
        assertEquals(4, (int) result.head.next.next.next.data);
    }
}