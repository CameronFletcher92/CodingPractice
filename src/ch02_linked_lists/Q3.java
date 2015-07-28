package ch02_linked_lists;

public class Q3 {
    public static void deleteNode(LinkedList.Node node) {
        // copy the data from the next node to this node
        node.data = node.next.data;

        // remove the next node
        node.next = node.next.next;
    }
}
