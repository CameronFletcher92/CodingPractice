package ch09_recursion_and_dynamic_programming;

import java.util.HashMap;

public class Q8 {
    public static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        return makeChange(n, denoms, 0, map);
    }

    public static void safeMapAdd(HashMap<Integer, HashMap<Integer, Integer>> map, int amount, int denom, int count) {
        // create sub map
        HashMap<Integer, Integer> subMap;
        if (!map.containsKey(amount)) {
            subMap = new HashMap<>();
            map.put(amount, subMap);
        } else {
            subMap = map.get(amount);
        }

        // create entry in the sub map
        if (!subMap.containsKey(denom)) {
            subMap.put(denom, count);
        }
    }

    private static int makeChange(int amount, int[] denoms, int index, HashMap<Integer, HashMap<Integer, Integer>> map) {
        // base case, last 1 cent
        if (index == (denoms.length - 1)) {
            return 1;
        }

        int denom = denoms[index];

        // retrieve cached value
        if (map.containsKey(amount) && map.get(amount).containsKey(denom)) {
            return map.get(amount).get(denom);
        }

        // count the number of ways
        int count = 0;
        for (int i = 0; (denom * i) <= amount; i++) {
            int subAmount = amount - (denom * i);
            count += makeChange(subAmount, denoms, index + 1, map);
        }

        // add to the hashmap
        safeMapAdd(map, amount, denom, count);
        return count;
    }
}
