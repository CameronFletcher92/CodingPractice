package ch05_bit_manipulation;
import junit.framework.TestCase;

public class Q6Test extends TestCase {
    public void testSwitchOddEvenBits() throws Exception {
        assertEquals(0b01010101, Q6.switchOddEvenBits(0b10101010));
        assertEquals(0b11001100, Q6.switchOddEvenBits(0b11001100));
    }
}