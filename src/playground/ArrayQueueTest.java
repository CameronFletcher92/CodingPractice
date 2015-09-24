package playground;
        import junit.framework.TestCase;

public class ArrayQueueTest extends TestCase {
    public void testQueue() throws Exception {
        ArrayQueue<Integer> q = new ArrayQueue<>(5);

        // queue and dequeue 3 items
        for (int i = 0; i < 3; i++) {
            assertEquals(i, q.getSize());
            q.enqueue(i);
        }

        for (int i = 0; i < 3; i++) {
            assertEquals(3 - i, q.getSize());
            assertEquals(i, (int)q.dequeue());
        }

        // do it again to ensure rotation
        for (int i = 0; i < 3; i++) {
            assertEquals(i, q.getSize());
            q.enqueue(i);
        }

        for (int i = 0; i < 3; i++) {
            assertEquals(3 - i, q.getSize());
            assertEquals(i, (int)q.dequeue());
        }
    }

    public void testQueueExceptions() throws Exception {
        ArrayQueue<Integer> q = new ArrayQueue<>(5);

        for (int i = 0; i < 5; i++) {
            assertEquals(i, q.getSize());
            q.enqueue(i);
        }

        // make sure can't enqueue when full
        try {
            q.enqueue(50);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }

        // dequeue the items
        for (int i = 0; i < 5; i++) {
            assertEquals(5 - i, q.getSize());
            assertEquals(i, (int)q.dequeue());
        }

        // make sure can't dequeue when empty
        try {
            q.dequeue();
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
