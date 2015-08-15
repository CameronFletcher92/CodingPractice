package ch09_recursion_and_dynamic_programming;


import java.util.ArrayList;

public class Q4 {
    public static ArrayList<ArrayList<Integer>> getAllSets(ArrayList<Integer> set) {
        // create the set of sets, initialize with just the empty set
        ArrayList<ArrayList<Integer>> allSets = new ArrayList<>();
        allSets.add(new ArrayList<Integer>());

        for (int num : set) {
            int startingSize = allSets.size();
            for (int i = 0; i < startingSize; i++) {
                ArrayList<Integer> newSet = new ArrayList<>(allSets.get(i));
                newSet.add(num);
                allSets.add(newSet);
            }
        }
        return allSets;
    }
}
