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
        assertEquals((int)result.head.data, 2);
        assertEquals((int)result.head.next.data, 1);
        assertEquals((int)result.head.next.next.data, 9);
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
        assertEquals((int)result.head.data, 9);
        assertEquals((int)result.head.next.data, 1);
        assertEquals((int)result.head.next.next.data, 2);


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
        assertEquals((int)result.head.data, 1);
        assertEquals((int)result.head.next.data, 2);
        assertEquals((int)result.head.next.next.data, 3);
        assertEquals((int)result.head.next.next.next.data, 4);
    }
}