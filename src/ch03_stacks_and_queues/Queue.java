package ch03_stacks_and_queues;

public class Queue<E> {
    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> first;
    private Node<E> last;

    public void enqueue(E item) {
        Node<E> node = new Node<>(item);

        if (last == null) {
            last = node;
            first = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public E dequeue() {
        if (first == null) {
            return null;
        } else {
            Node<E> ret = first;
            first = first.next;
            return ret.data;
        }
    }
}
