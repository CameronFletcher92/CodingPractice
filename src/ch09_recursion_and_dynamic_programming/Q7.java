package ch09_recursion_and_dynamic_programming;

public class Q7 {
    public static enum Color {
        Red, Blue, Green
    }

    private static void fill(Color[][] screen, int x, int y, Color oldColor, Color newColor) {
        // base case, this pixel doesn't match the old color
        if (screen[x][y] != oldColor || screen[x][y] == newColor || x < 0 || x > screen.length || y < 0 || y > screen[0].length) {
            return;
        }

        // set the pixel
        screen[x][y] = newColor;

        // spread outward
        fill(screen, x + 1, y, oldColor, newColor);
        fill(screen, x - 1, y, oldColor, newColor);
        fill(screen, x, y + 1, oldColor, newColor);
        fill(screen, x, y - 1, oldColor, newColor);
    }

    public static void fill(Color[][] screen, int x, int y, Color newColor) {
        // get the target pixel's color
        Color oldColor = screen[x][y];
        if (oldColor != newColor) {
            fill(screen, x, y, oldColor, newColor);
        }
    }

}
