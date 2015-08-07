package ch05_bit_manipulation;

import java.util.ArrayList;

public class Q3 {
    private static int getNext(int n) {
        // compute c0 and c1
        int c = n;
        int c0 = 0;
        int c1 = 0;

        while (((c & 1) == 0) && (c != 0)) {
            c0++;
            c >>= 1;
        }

        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }

        // error: if n == 11110000 (or similar), there are no bigger number with same ones
        if (c0 + c1 == 31 || c0 + c1 == 0) {
            return -1;
        }

        // position of rightmost non-trailing zero
        int p = c0 + c1;

        // flip the rightmost non trailing zero
        n |= (1 << p);

        // clear all bits to the right of p
        n &= ~((1 << p) - 1);

        // Insert (c1 - 1) ones on the right
        n |= (1 << (c1 - 1)) - 1;

        return n;
    }

    private static int getPrev(int n) {
        int temp = n;
        int c0 = 0;
        int c1 = 0;

        while ((temp & 1) == 1) {
            c1++;
            temp >>= 1;
        }

        if (temp == 0) return -1;

        while (((temp & 1) == 0) && (temp != 0)) {
            c0++;
            temp >>= 1;
        }

        // get position of rightmost non-trailing 1
        int p = c0 + c1;

        // clears from p onwards
        n &= ((~0) << (p + 1));

        // sequence of (c1 + 1) ones
        int mask = (1 << (c1 + 1)) - 1;
        n |= (mask << (c0 - 1));

        return n;
    }

    public static ArrayList<String> printNextSmallestAndLargest(int num) {
        ArrayList<String> result = new ArrayList<>();

        String prev = Integer.toBinaryString(getPrev(num));
        String next = Integer.toBinaryString(getNext(num));

        result.add(prev);
        result.add(next);
        return result;
    }
}
