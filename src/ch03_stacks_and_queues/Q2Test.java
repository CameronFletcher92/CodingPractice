package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q2Test extends TestCase {
    public void testMinStack() throws Exception {
        Q2.MinStack ms = new Q2.MinStack();

        ms.push(5);
        ms.push(4);
        ms.push(3);
        ms.push(2);
        ms.push(1);

        assertEquals(1, (int)ms.getMin());
        ms.pop();
        assertEquals(2, (int)ms.getMin());
        ms.pop();
        assertEquals(3, (int)ms.getMin());
        ms.pop();
        assertEquals(4, (int)ms.getMin());
        ms.pop();
        assertEquals(5, (int)ms.getMin());
    }

}