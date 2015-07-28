package ch02_linked_lists;

public class Q2 {
    public static <E> E findKthLast(LinkedList<E> linkedList, int k) {
        LinkedList.Node p1 = linkedList.head;
        LinkedList.Node p2 = linkedList.head;

        // move p2 up k elements
        for (int i = 0; i < k; i++) {
            p2 = p2.next;
        }

        // move p2 to the end of the list
        while(p2 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }

        // p1 should now be at length - k
        return (E)p1.data;
    }
}
