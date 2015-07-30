package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testTripleStack() throws Exception {
        Q1.TripleStack ts = new Q1.TripleStack(5);
        ts.push(0, 1);
        ts.push(0, 2);
        ts.push(0, 3);
        ts.push(1, 4);
        ts.push(1, 5);
        ts.push(1, 6);
        ts.push(2, 7);
        ts.push(2, 8);
        ts.push(2, 9);

        assertEquals(3, (int)ts.peek(0));
        assertEquals(3, (int)ts.pop(0));
        assertEquals(2, (int)ts.peek(0));
        assertEquals(2, (int)ts.pop(0));
        assertEquals(1, (int)ts.peek(0));
        assertEquals(1, (int)ts.pop(0));
        assertEquals(6, (int)ts.peek(1));
        assertEquals(6, (int)ts.pop(1));
        assertEquals(5, (int)ts.peek(1));
        assertEquals(5, (int)ts.pop(1));
        assertEquals(4, (int)ts.peek(1));
        assertEquals(4, (int)ts.pop(1));
        assertEquals(9, (int)ts.peek(2));
        assertEquals(9, (int)ts.pop(2));
        assertEquals(8, (int)ts.peek(2));
        assertEquals(8, (int)ts.pop(2));
        assertEquals(7, (int)ts.peek(2));
        assertEquals(7, (int)ts.pop(2));

        assertEquals(null, ts.peek(0));
        assertEquals(null, ts.pop(0));
        assertEquals(null, ts.peek(1));
        assertEquals(null, ts.pop(1));
        assertEquals(null, ts.peek(2));
        assertEquals(null, ts.pop(2));
    }
}