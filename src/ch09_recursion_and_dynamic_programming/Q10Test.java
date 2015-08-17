package ch09_recursion_and_dynamic_programming;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q10Test extends TestCase {
    public void testGetTallestBox() throws Exception {
        ArrayList<Q10.Box> boxes = new ArrayList<>();
        boxes.add(new Q10.Box(1, 2, 1));
        boxes.add(new Q10.Box(2, 3, 2));
        boxes.add(new Q10.Box(3, 4, 3));
        boxes.add(new Q10.Box(16, 17, 4));
        boxes.add(new Q10.Box(10, 11, 5));
        boxes.add(new Q10.Box(4, 5, 6));

        ArrayList<Q10.Box> tallest = Q10.getTallestStack(boxes);
        assertEquals(4, tallest.get(0).width);
        assertEquals(5, tallest.get(0).depth);
        assertEquals(6, tallest.get(0).height);

        assertEquals(3, tallest.get(1).width);
        assertEquals(4, tallest.get(1).depth);
        assertEquals(3, tallest.get(1).height);

        assertEquals(2, tallest.get(2).width);
        assertEquals(3, tallest.get(2).depth);
        assertEquals(2, tallest.get(2).height);

        assertEquals(1, tallest.get(3).width);
        assertEquals(2, tallest.get(3).depth);
        assertEquals(1, tallest.get(3).height);
    }
}