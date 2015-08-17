package ch09_recursion_and_dynamic_programming;

import java.util.ArrayList;

public class Q9 {
    // my implementation
    public static class Location {
        public int x;
        public int y;

        public Location (int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    private static boolean canPlace(Location newLoc, ArrayList<Location> queens) {
        for (Location l : queens) {
            // check if in same row / col
            if (l.x == newLoc.x || l.y == newLoc.y) {
                return false;
            }

            // check if on the same diagonal
            int rowDist = Math.abs(newLoc.x - l.x);
            int colDist = Math.abs(newLoc.y - l.y);
            if (rowDist == colDist) {
                return false;
            }
        }

        return true;
    }

    private static void placeQueens(int row, ArrayList<Location> queens, ArrayList<ArrayList<Location>> results) {
        // base case: we have placed all the queens
        if (queens.size() == 8) {
            results.add(queens);
            return;
        }

        for (int col = 0; col < 8; col++) {
            Location newLoc = new Location(row, col);
            if (canPlace(newLoc, queens)) {
                ArrayList<Location> newQueens = (ArrayList<Location>)queens.clone();
                newQueens.add(newLoc);
                placeQueens(row + 1, newQueens, results);
            }
        }
    }

    public static ArrayList<ArrayList<Location>> placeQueens() {
        ArrayList<ArrayList<Location>> results = new ArrayList<>();
        ArrayList<Location> queens = new ArrayList<>();

        placeQueens(0, queens, results);
        return results;
    }

}
