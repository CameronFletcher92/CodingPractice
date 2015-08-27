package ch09_recursion_and_dynamic_programming;

import java.awt.*;
import java.util.ArrayList;

public class Q9 {
    public static ArrayList<ArrayList<Point>> placeQueens() {
        ArrayList<Point> queens = new ArrayList<>();
        ArrayList<ArrayList<Point>> results = new ArrayList<>();
        placeQueens(queens, 0, results);

        return results;
    }

    private static void placeQueens(ArrayList<Point> queens, int y, ArrayList<ArrayList<Point>> ways) {
        if (y == 8) {
            ways.add((ArrayList<Point>)queens.clone());
        }

        for (int x = 0; x < 8; x++) {
            Point p = new Point(x, y);
            if (isValid(queens, p)) {
                queens.add(p);
                placeQueens(queens, y + 1, ways);
                queens.remove(y);
            }
        }
    }

    private static boolean isValid(ArrayList<Point> queens, Point q) {
        for (Point p : queens) {
            if (p.x == q.x || p.y == q.y || Math.abs(p.x - q.x) == Math.abs(p.y - q.y)) {
                return false;
            }
        }

        return true;
    }


}
