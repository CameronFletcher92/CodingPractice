package ch01_arrays_and_strings;

public class Q7 {
    private static void clearRow(int[][] m, int row) {
        for (int i = 0; i < m[row].length; i++) {
            m[row][i] = 0;
        }
    }

    private static void clearColAbove(int[][] m, int row, int col) {
        if (row == 0) return;
        for (int i = row - 1; i >= 0; i--) {
            m[i][col] = 0;
        }
    }

    public static int[][] setZeros(int[][] m) {
        boolean[] clearedCols = new boolean[m[0].length];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (clearedCols[col]) {
                    m[row][col] = 0;
                } else if (m[row][col] == 0) {
                    clearRow(m, row);
                    clearedCols[col] = true;
                    clearColAbove(m, row, col);
                    break;
                }
            }
        }

        return m;
    }
}
