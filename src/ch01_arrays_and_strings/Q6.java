package ch01_arrays_and_strings;

public class Q6 {
    /*
    public static int[][] rotate(int[][] image) {
        int n = image.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                // save top
                int top = image[first][i];

                // left => top
                image[first][i] = image[last - offset][first];

                // bottom => left
                image[last - offset][first] = image[last][last - offset];

                // right => bottom
                image[last][last - offset] = image[i][last];

                // top => right
                image[i][last] = top;
            }

        }

        return image;
    }
    */
    /*
    public static int[][] rotate(int[][] m) {
        for (int layer = 0; layer < (m.length / 2); layer++) {
            int last = m.length - 1 - layer;

            for (int offset = 0; offset < (last - layer); offset++) {
                // save top
                int top = m[layer][layer + offset];

                // assign left to top
                m[layer][layer + offset] = m[last - offset][layer];

                // assign bottom to left
                m[last - offset][layer] = m[last][last - offset];

                // assign right to bottom
                m[last][last - offset] = m[layer + offset][last];

                // assign top to right
                m[layer + offset][last] = top;
            }
        }

        return m;
    }
    */

    public static int[][] rotate(int[][] m) {
        int levels = m.length / 2;

        for (int level = 0; level < levels; level++) {
            // last elem in row or column
            int last = m.length - level - 1;

            // from level(first row/col) to last
            for (int offset = 0; offset < (last - level); offset++) {
                // save elem in top row
                int top = m[level][level + offset];

                // assign left col to top row
                m[level][level + offset] = m[last - offset][level];

                // assign bottom row to left col
                m[last-offset][level] = m[last][last - offset];

                // assign right col to bottom row
                m[last][last - offset] = m[level + offset][last];

                // assign the saved top to the right col
                m[level + offset][last] = top;
            }
        }

        return m;
    }
}
