package ch05_bit_manipulation;
import junit.framework.TestCase;

public class Q5Test extends TestCase {
    public void testGetFlipCount() throws Exception {
        int a = 0b111010101;
        int b = 0b001010010;

        assertEquals(5, Q5.getFlipCount(a, b));

        a = 0b00000;
        b = 0b11111;

        assertEquals(5, Q5.getFlipCount(a, b));
    }

}