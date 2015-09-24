package ch04_trees_and_graphs;

import java.util.ArrayList;

public class Q9 {
    /*
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
    */

    private static ArrayList<TreeNode> generatePath(ArrayList<TreeNode> fullPath, int startIndex) {
        // add all nodes from i to end
        ArrayList<TreeNode> newPath = new ArrayList<>();

        for (int i = startIndex; i < fullPath.size(); i++) {
            newPath.add(fullPath.get(i));
        }

        return newPath;
    }

    private static void getPaths(TreeNode n, int target, ArrayList<TreeNode> path, ArrayList<ArrayList<TreeNode>> paths) {
        // base case
        if (n == null) {
            return;
        }

        // add n to path
        path.add(n);

        // see if this node ended a sum to target
        int counter = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            counter += path.get(i).data;
            if (counter == target) {
                paths.add(generatePath(path, i));
            }
        }

        // recurse
        getPaths(n.leftChild, target, path, paths);
        getPaths(n.rightChild, target, path, paths);

        // remove self from path (so levels above won't be affected
        path.remove(path.size() - 1);
    }

    public static ArrayList<ArrayList<TreeNode>> findSum(TreeNode root, int target) {
        if (root == null) return null;

        ArrayList<ArrayList<TreeNode>> paths = new ArrayList<>();
        ArrayList<TreeNode> path = new ArrayList<>();

        getPaths(root, target, path, paths);
        return paths;
    }

}
