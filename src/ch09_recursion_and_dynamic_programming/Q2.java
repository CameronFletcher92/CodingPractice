package ch09_recursion_and_dynamic_programming;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

public class Q2 {
    private static void getWays(Point pos, ArrayList<Point> path, ArrayList<ArrayList<Point>> paths) {
        if (pos.x < 0 || pos.y < 0) {
            return;
        }

        path.add(pos);

        if (pos.x == 0 && pos.y == 0) {
            paths.add((ArrayList<Point>)path.clone());
        }

        // search up
        getWays(new Point(pos.x, pos.y - 1), path, paths);

        // search left
        getWays(new Point(pos.x - 1, pos.y), path, paths);

        // remove this point from the path
        path.remove(path.size() - 1);
    }

    public static ArrayList<ArrayList<Point>> getWays(Point dest) {
        ArrayList<Point> path = new ArrayList<>();
        ArrayList<ArrayList<Point>> paths = new ArrayList<>();

        getWays(dest, path, paths);
        return paths;
    }




    // OLD IMPLEMENTATION
    public static class Location {
        public int x;
        public int y;

        public boolean equals(Object b) {
            if (b.getClass() != Location.class) {
                return false;
            } else if (((Location)b).x == this.x && ((Location)b).y == this.y) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            int hash = 7;
            hash = ((71 * hash) + this.x) + ((71 * hash) + this.y);
            return hash;
        }

        public String toString() {
            return "(" + this.x + "," + this.y + ")";
        }

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static HashMap<Location, Integer> map = new HashMap<>();

    public static int countWays(Location start, Location end) {
        if (map.containsKey(end)) {
            return map.get(end);
        }

        // if the end and the start are the same (or we have gone too far)
        if (start.equals(end) || start.x > end.x || start.y > end.y) {
            return 0;
        }

        // 1 horizontal move
        if (end.x - start.x == 1 && end.y - start.y == 0) {
            return 1;
        }

        // 1 vertical move
        if (end.y - start.y == 1 && end.x - start.x == 0) {
            return 1;
        }

        Location end1 = new Location(end.x - 1, end.y);
        Location end2 = new Location(end.x, end.y - 1);
        map.put(end, countWays(start, end1) + countWays(start, end2));
        return map.get(end);
    }
}
