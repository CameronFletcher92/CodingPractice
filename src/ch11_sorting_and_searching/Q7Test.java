package ch11_sorting_and_searching;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q7Test extends TestCase {
    public void testGetLongestTower() throws Exception {
        Q7.Person p1 = new Q7.Person(1, 1);
        Q7.Person p2 = new Q7.Person(2, 2);
        Q7.Person p3 = new Q7.Person(3, 3);
        Q7.Person p4 = new Q7.Person(4, 4);
        Q7.Person p5 = new Q7.Person(5, 5);
        Q7.Person p6 = new Q7.Person(6, 6);
        Q7.Person p6b = new Q7.Person(6, 8);
        Q7.Person p6c = new Q7.Person(8, 6);
        Q7.Person p10 = new Q7.Person(10, 10);

        ArrayList<Q7.Person> people = new ArrayList<>();
        people.add(p10);
        people.add(p6c);
        people.add(p6b);
        people.add(p6);
        people.add(p5);
        people.add(p4);
        people.add(p3);
        people.add(p2);
        people.add(p1);

        ArrayList<Q7.Person> result = Q7.getLongestTower(people);
        assertEquals(7, result.size());
    }
}