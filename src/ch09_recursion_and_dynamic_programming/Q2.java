package ch09_recursion_and_dynamic_programming;

import java.util.HashMap;

public class Q2 {
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
            hash = 71 * hash + this.x;
            hash = 71 * hash + this.y;
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
