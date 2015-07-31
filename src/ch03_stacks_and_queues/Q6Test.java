package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q6Test extends TestCase {
    public void testSortStack() throws Exception {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(4);
        s.push(6);
        s.push(1);
        s.push(3);
        s.push(2);

        s = Q6.sortStack(s);

        assertEquals(6, (int)s.pop());
        assertEquals(5, (int)s.pop());
        assertEquals(4, (int)s.pop());
        assertEquals(3, (int)s.pop());
        assertEquals(2, (int)s.pop());
        assertEquals(1, (int)s.pop());
    }
}