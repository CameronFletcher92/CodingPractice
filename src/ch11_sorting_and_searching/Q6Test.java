package ch11_sorting_and_searching;
import junit.framework.TestCase;

public class Q6Test extends TestCase {
    public void testFindElement() throws Exception {
        int[][] matrix = new int[][]{
                new int[] {1, 3, 5, 7, 9},
                new int[] {11, 13, 15, 17, 19},
                new int[] {21, 23, 25, 27, 29},
                new int[] {31, 33, 35, 37, 39},
        };

        int[] pos = Q6.findElement(matrix, 17);
        assertEquals(1, pos[0]);
        assertEquals(3, pos[1]);

        pos = Q6.findElement(matrix, 35);
        assertEquals(3, pos[0]);
        assertEquals(2, pos[1]);

        pos = Q6.findElement(matrix, 70);
        assertEquals(-1, pos[0]);
        assertEquals(-1, pos[1]);
    }

}