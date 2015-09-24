package ch05_bit_manipulation;

public class Q1 {
    private static int clearBits(int num, int i, int j) {
        int left = -1 << (j + 1);
        int right = ~(-1 << i);
        int mask = left | right;
        return num & mask;
    }

    public static int insertInto(int big, int small, int i, int j) {
        small = small << i;
        big = clearBits(big, i, j);
        int merge = big | small;
        return merge;
    }
}
