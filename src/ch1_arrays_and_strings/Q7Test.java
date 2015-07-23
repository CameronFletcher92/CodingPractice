package ch1_arrays_and_strings;
import junit.framework.TestCase;

public class Q7Test extends TestCase {

    public void testRotate() throws Exception {
        int[][] image = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 0, 6},
                new int[]{7, 8, 9}
        };

        int[][] zeroedImage = new int[][]{
                new int[]{1, 0, 3},
                new int[]{0, 0, 0},
                new int[]{7, 0, 9}
        };

        int[][] result = Q7.setZeros(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                assertEquals(zeroedImage[i][j], result[i][j]);
            }
        }

        image = new int[][]{
                new int[]{0, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 0}
        };

        zeroedImage = new int[][]{
                new int[]{0, 0, 0},
                new int[]{0, 5, 0},
                new int[]{0, 0, 0}
        };

        result = Q7.setZeros(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                assertEquals(zeroedImage[i][j], result[i][j]);
            }
        }
    }
}