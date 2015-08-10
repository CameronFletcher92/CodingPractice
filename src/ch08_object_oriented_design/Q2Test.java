package ch08_object_oriented_design;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class Q2Test extends TestCase {
    public void testCallCenter() throws Exception {
        List<Q2.Employee> respondents = new ArrayList<>();
        List<Q2.Employee> managers = new ArrayList<>();
        List<Q2.Employee> directors = new ArrayList<>();

        Q2.Employee r1 = new Q2.Employee("r1");
        Q2.Employee r2 = new Q2.Employee("r2");
        Q2.Employee r3 = new Q2.Employee("r3");
        respondents.add(r1);
        respondents.add(r2);
        respondents.add(r3);

        Q2.Employee m1 = new Q2.Employee("m1");
        Q2.Employee m2 = new Q2.Employee("m2");
        Q2.Employee m3 = new Q2.Employee("m3");
        managers.add(m1);
        managers.add(m2);
        managers.add(m3);

        Q2.Employee d1 = new Q2.Employee("d1");
        directors.add(d1);

        Q2.CallCenter center = new Q2.CallCenter(respondents, managers, directors);

        assertFalse(r1.getIsBusy());
        center.dispatchCall();
        assertTrue(r1.getIsBusy());

        assertFalse(r2.getIsBusy());
        center.dispatchCall();
        assertTrue(r2.getIsBusy());

        assertFalse(r3.getIsBusy());
        center.dispatchCall();
        assertTrue(r3.getIsBusy());

        assertFalse(m1.getIsBusy());
        center.dispatchCall();
        assertTrue(m1.getIsBusy());

        assertFalse(m2.getIsBusy());
        center.dispatchCall();
        assertTrue(m2.getIsBusy());

        assertFalse(m3.getIsBusy());
        center.dispatchCall();
        assertTrue(m3.getIsBusy());

        assertFalse(d1.getIsBusy());
        center.dispatchCall();
        assertTrue(d1.getIsBusy());

        try {
            center.dispatchCall();
        } catch (Exception e) {
            assertTrue(true);
            return;
        }

        assertFalse(true);
    }
}