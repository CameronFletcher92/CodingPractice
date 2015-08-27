package ch09_recursion_and_dynamic_programming;


import java.util.ArrayList;

public class Q4 {
    // ITERATIVE
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

    // RECURSIVE
    public static ArrayList<ArrayList<Integer>> setOfSets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> ret;

        // base case: empty set
        if (set.size() == 0) {
            ret = new ArrayList<>();
            ret.add(new ArrayList<Integer>());
            return ret;
        }

        // general case
        // remove last elem from set
        int last = set.remove(set.size() - 1);

        // get all subsets of this smaller set
        ret = setOfSets(set);

        // clone each element, merging with last and adding to ret
        int size = ret.size();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> sub = ret.get(i);
            sub = (ArrayList<Integer>)sub.clone();
            sub.add(last);
            ret.add(sub);
        }

        // add the last elem back onto the set (good practise so set doesn't change)
        set.add(last);
        return ret;
    }
}
