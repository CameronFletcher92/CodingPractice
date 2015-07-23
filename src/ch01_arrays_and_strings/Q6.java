package ch01_arrays_and_strings;

public class Q6 {
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
}
