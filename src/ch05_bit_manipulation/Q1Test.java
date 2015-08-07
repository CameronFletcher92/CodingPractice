package ch05_bit_manipulation;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testInsertInto() throws Exception {
        int n = 0b10000000000;
        int m = 0b10011;

        int i = 2, j = 6;

        assertEquals(0b10001001100, Q1.insertInto(n, m, i, j));
    }

}