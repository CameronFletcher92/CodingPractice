package ch05_bit_manipulation;

public class Q1 {
    public static int insertInto(int n, int m, int i, int j) {
        // first clear i to j in n
        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = ~(1 << i);
        int mask = left | right;
        int cleared = n & mask;

        // shift m so it lines up with i and j
        int shifted = m << i;

        // or the cleared n with the shifted m
        return cleared | shifted;
    }
}
