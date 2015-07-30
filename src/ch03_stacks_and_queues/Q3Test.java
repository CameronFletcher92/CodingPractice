package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q3Test extends TestCase {
    public void testSetOfStacks() throws Exception {
        Q3.SetOfStacks ss = new Q3.SetOfStacks(3);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.push(6);
        ss.push(7);
        ss.push(8);
        ss.push(9);

        assertEquals(9, (int)ss.pop());
        assertEquals(8, (int)ss.pop());
        assertEquals(7, (int)ss.pop());
        assertEquals(6, (int)ss.pop());
        assertEquals(5, (int)ss.pop());
        assertEquals(4, (int)ss.pop());
        assertEquals(3, (int)ss.pop());
        assertEquals(2, (int)ss.pop());
        assertEquals(1, (int)ss.pop());
        assertEquals(null, ss.pop());

        ss.push(1);
        ss.push(2);
        ss.push(3);

        assertEquals(3, (int)ss.pop());
        assertEquals(2, (int)ss.pop());
        assertEquals(1, (int)ss.pop());
        assertEquals(null, ss.pop());
    }

}