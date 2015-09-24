package ch01_arrays_and_strings;
import junit.framework.TestCase;

public class Q6Test extends TestCase {

    public void testRotate() throws Exception {
        int[][] image = new int[][]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8, 9, 10},
                new int[]{11, 12, 13, 14, 15},
                new int[]{16, 17, 18, 19, 20},
                new int[]{21, 22, 23, 24, 25},
        };

        int[][] rotatedImage = new int[][]{
                new int[]{21, 16, 11, 6, 1},
                new int[]{22, 17, 12, 7, 2},
                new int[]{23, 18, 13, 8, 3},
                new int[]{24, 19, 14, 9, 4},
                new int[]{25, 20, 15, 10, 5}
        };

        int[][] result = Q6.rotate(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                assertEquals(rotatedImage[i][j], result[i][j]);
            }
        }
    }
}