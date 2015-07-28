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

    public static <E> void removeDups2(LinkedList<E> list) {
        LinkedList.Node current = list.head;
        LinkedList.Node runner;
        LinkedList.Node prev;

        while (current != null) {
            // start at the current node
            prev = current;
            runner = current.next;

            // run to the end, looking for duplicates
            while (runner != null) {
                if (current.data == runner.data) {
                    prev.next = runner.next;
                }
                prev = runner;
                runner = runner.next;
            }

            current = current.next;
        }
    }
}
