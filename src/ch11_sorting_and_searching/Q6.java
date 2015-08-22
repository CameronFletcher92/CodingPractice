package ch11_sorting_and_searching;

public class Q6 {
    private static int[] convertToMatrixPos(int pos, int rowLength) {
        int row = pos / rowLength;
        int col = pos % rowLength;

        return new int[]{row, col};
    }

    private static int[] findElement(int[][] matrix, int num, int start, int end) {
        int mid = (start + end) / 2;
        int[] midPos = convertToMatrixPos(mid, matrix[0].length);
        int midVal = matrix[midPos[0]][midPos[1]];

        // base case
        if (midVal == num) {
            return midPos;
        }

        // error case
        if (start > end) {
            return new int[]{-1, -1};
        }

        if (midVal > num) {
            // search left
            return findElement(matrix, num, start, mid - 1);
        } else if (midVal < num) {
            // search right
            return findElement(matrix, num, mid + 1, end);
        }

        return new int[]{-1, -1};
    }

    public static int[] findElement(int[][] matrix, int num) {
        int end = (matrix.length * matrix[0].length) - 1;
        return findElement(matrix, num, 0, end);
    }
}
