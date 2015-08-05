package ch04_trees_and_graphs;

import java.util.ArrayList;

public class Q9 {
    private static ArrayList<Integer> generatePath(int[] path, int start, int end) {
        ArrayList<Integer> newPath = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            newPath.add(path[i]);
        }

        return newPath;
    }

    private static void findSum(TreeNode node, int sum, int[] path, int level, ArrayList<ArrayList<Integer>> matchingPaths) {
        if (node == null) {
            return;
        }

        // insert the current node onto the path
        path[level] = node.data;

        // look for paths with a sum that ends at this node
        int runningTotal = 0;
        for (int i = level; i >= 0; i--) {
            runningTotal += path[i];
            if (runningTotal == sum) {
                matchingPaths.add(generatePath(path, i, level));
            }
        }

        // search nodes beneath this one
        findSum(node.leftChild, sum, path, level + 1, matchingPaths);
        findSum(node.rightChild, sum, path, level + 1, matchingPaths);
    }

    private static int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(getDepth(node.leftChild), getDepth(node.rightChild));
        }
    }

    public static ArrayList<ArrayList<Integer>> findSum(TreeNode root, int sum) {
        int depth = getDepth(root);
        int[] path = new int[depth];

        ArrayList<ArrayList<Integer>> matchingPaths = new ArrayList<>();
        findSum(root, sum, path, 0, matchingPaths);

        return matchingPaths;
    }

}
