package ch03_stacks_and_queues;
import junit.framework.TestCase;

public class Q4Test extends TestCase {
    public void testTowersOfHanoi() throws Exception {
        int numDisks = 3;

        Q4.Tower[] towers = new Q4.Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Q4.Tower(i);
        }

        for (int i = numDisks - 1; i >= 0; i--) {
            towers[0].add(i);
        }

        towers[0].moveDisks(numDisks, towers[2], towers[1]);


        for (int i = 0; i < numDisks; i++) {
            assertEquals(i, (int)towers[2].getDisks().pop());
        }
    }

}