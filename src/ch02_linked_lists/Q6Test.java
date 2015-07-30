package ch02_linked_lists;
import junit.framework.TestCase;

public class Q6Test extends TestCase {
    public void testDetectLoop() throws Exception {
        LinkedList.Node a = new LinkedList.Node<>(1);
        LinkedList.Node b = new LinkedList.Node<>(2);
        LinkedList.Node c = new LinkedList.Node<>(3);
        LinkedList.Node d = new LinkedList.Node<>(4);
        LinkedList.Node e = new LinkedList.Node<>(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        e.next = c;
        assertEquals(c, Q6.detectLoop(a));
        assertEquals(c, Q6.detectLoopRunner(a));

        e.next = null;
        assertEquals(null, Q6.detectLoop(a));
        assertEquals(null, Q6.detectLoopRunner(a));

        c.next = a;
        assertEquals(a, Q6.detectLoop(a));
        assertEquals(a, Q6.detectLoopRunner(a));
    }
}