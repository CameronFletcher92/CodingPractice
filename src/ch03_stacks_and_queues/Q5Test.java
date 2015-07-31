package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q5Test extends TestCase {
    public void testMyQueue() throws Exception {
        Q5.MyQueue queue = new Q5.MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        assertEquals(1, (int)queue.dequeue());
        assertEquals(2, (int)queue.dequeue());
        assertEquals(3, (int)queue.dequeue());

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        assertEquals(4, (int)queue.dequeue());
        assertEquals(5, (int)queue.dequeue());
        assertEquals(6, (int)queue.dequeue());
        assertEquals(7, (int)queue.dequeue());
        assertEquals(8, (int)queue.dequeue());
    }
}