package ch11_sorting_and_searching;

public class Q1 {
    public static int[] mergeInto(int[] a, int aSize, int[] b) {
        int aCursor = aSize - 1;
        int bCursor = b.length - 1;

        int mergedCursor = (aSize - 1) + b.length;

        while (aCursor >= 0 || bCursor >= 0) {
            if (bCursor == -1 || a[aCursor] > b[bCursor]) {
                a[mergedCursor] = a[aCursor];
                aCursor--;
            } else {
                a[mergedCursor] = b[bCursor];
                bCursor--;
            }
            mergedCursor--;
        }

        return a;
    }

}
