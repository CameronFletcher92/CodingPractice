package ch02_linked_lists;

import java.util.HashSet;

public class Q1 {
    public static <E> void removeDups(LinkedList<E> list) {
        HashSet<E> visited = new HashSet<>();
        LinkedList.Node n = list.head;
        LinkedList.Node prev = null;

        while (n != null) {
            if (visited.contains(n.data)) {
                prev.next = n.next;
            } else {
                visited.add((E)n.data);
            }

            prev = n;
            n = n.next;
        }
    }
}
