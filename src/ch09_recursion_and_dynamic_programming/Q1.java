package ch09_recursion_and_dynamic_programming;

import java.util.HashMap;

public class Q1 {
    public static HashMap<Integer, Integer> map = new HashMap<>();

    public static int countWays(int steps) {
        // dynamic part
        if (map.containsKey(steps)) {
            return map.get(steps);
        }

        if (steps < 0) {
            return 0;
        } else if (steps == 0) {
            return 1;
        } else {
            map.put(steps, countWays(steps - 1) + countWays(steps - 2) + countWays(steps - 3));
            return map.get(steps);
        }
    }
}
