package ch05_bit_manipulation;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q3Test extends TestCase {
    public void testPrintNextSmallestAndLargest() throws Exception {
        int num = 0b11011001111100;
        ArrayList<String> results = Q3.printNextSmallestAndLargest(num);

        assertEquals("11011001111010", results.get(0));
        assertEquals("11011010001111", results.get(1));
    }
}