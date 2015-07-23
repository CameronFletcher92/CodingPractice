package ch01_arrays_and_strings;
import junit.framework.TestCase;

public class Q6Test extends TestCase {

    public void testRotate() throws Exception {
        int[][] image = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };

        int[][] rotatedImage = new int[][]{
                new int[]{7, 4, 1},
                new int[]{8, 5, 2},
                new int[]{9, 6, 3}
        };

        int[][] result = Q6.rotate(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                assertEquals(rotatedImage[i][j], result[i][j]);
            }
        }
    }
}