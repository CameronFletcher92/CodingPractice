package ch03_stacks_and_queues;

public class Stack<E> {
    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> top;

    public void push(E item) {
        Node<E> node = new Node<>(item);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    public E peek() {
        if (top == null) {
            return null;
        } else {
            return top.data;
        }
    }

    public E pop() {
        if (top == null) {
            return null;
        } else {
            Node<E> ret = top;
            top = top.next;
            return ret.data;
        }
    }
}
