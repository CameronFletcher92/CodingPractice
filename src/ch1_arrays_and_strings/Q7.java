package ch1_arrays_and_strings;

public class Q7 {
    private static void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public static int[][] setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // nullify rows
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                nullifyRow(matrix, i);
            }
        }

        // nullify columns
        for (int j = 0; j < cols.length; j++) {
            if (cols[j]) {
                nullifyCol(matrix, j);
            }
        }

        return matrix;
    }
}
