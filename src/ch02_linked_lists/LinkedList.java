package ch02_linked_lists;

public class LinkedList<E> {
    public class Node {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return this.data.toString();
        }
    }

    Node head;

    public void prepend(E data) {
        Node start = new Node(data);

        // first prepend
        if (head == null) {
            head = start;
            return;
        }

        // other prepends
        start.next = head;
        head = start;
    }

    public void append(E data) {
        Node end = new Node(data);

        // first append
        if (head == null) {
            head = end;
            return;
        }

        // other appends
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public int length() {
        // empty length
        if (head == null) {
            return 0;
        }

        // otherwise count the nodes
        int size = 1;
        Node n = head;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        return size;
    }

    public String toString() {
        // empty length
        if (head == null) {
            return "";
        }

        // otherwise concat the node data
        StringBuffer buff = new StringBuffer();
        buff.append(head.data);
        buff.append(',');

        Node n = head;
        while (n.next != null) {
            n = n.next;
            buff.append(n.data);
            buff.append(',');
        }

        buff.deleteCharAt(buff.length() - 1);
        return buff.toString();
    }
}
