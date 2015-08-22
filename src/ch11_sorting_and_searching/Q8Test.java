package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q8Test extends TestCase {
    public void testIntegerStream() throws Exception {
        Q8.Tracker t = new Q8.Tracker();
        t.track(5);
        t.track(1);
        t.track(4);
        t.track(4);
        t.track(5);
        t.track(9);
        t.track(7);
        t.track(13);
        t.track(3);

        assertEquals(0, t.getRankOfNumber(1));
        assertEquals(1, t.getRankOfNumber(3));
        assertEquals(3, t.getRankOfNumber(4));
    }



}