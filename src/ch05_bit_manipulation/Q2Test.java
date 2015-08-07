package ch05_bit_manipulation;
import junit.framework.TestCase;

public class Q2Test extends TestCase {
    public void testPrintBinary() throws Exception {
        double num = 0.75;
        assertEquals("0.11", Q2.printBinary(num));

        num = 0.625;
        assertEquals("0.101", Q2.printBinary(num));
    }

}