package ch05_bit_manipulation;
import junit.framework.TestCase;

import java.util.Arrays;

public class Q8Test extends TestCase {
    public void testDrawHorizontalLine() throws Exception {
        byte[] screen = new byte[]{
                0b00000000, 0b00000000,
                0b00000000, 0b00000000,
                0b00000000, 0b00000000,
                0b00000000, 0b00000000
        };

        byte[] result = new byte[] {
                0b00000000, 0b00000000,
                0b00000000, 0b00000000,
                0b00000111, (byte)0b11100000,
                0b00000000, 0b00000000
        };

        assertTrue(Arrays.equals(result, Q8.drawHorizontalLine(screen, 16, 5, 10, 2)));

        screen = new byte[]{
                0b00000000,
                0b00000000,
                0b00000000,
                0b00000000
        };

        result = new byte[] {
                0b00000000,
                0b00000000,
                0b00111000,
                0b00000000
        };

        assertTrue(Arrays.equals(result, Q8.drawHorizontalLine(screen, 8, 2, 4, 2)));
    }
}