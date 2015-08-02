package ch04_trees_and_graphs;

public class Q1 {
    private static int getHeight(TreeNode branch) {
        // base case
        if (branch == null) {
            return 0;
        }

        // get the tallest branch, and add 1 to it (for itself)
        int tallestSubBranch = Math.max(getHeight(branch.leftChild), getHeight(branch.rightChild));
        return tallestSubBranch + 1;
    }


    public static boolean isBalanced(TreeNode root) {
        // base case
        if (root == null) {
            return true;
        }

        // get height diff
        int heightDiff = Math.abs(getHeight(root.leftChild) - getHeight(root.rightChild));
        if (heightDiff > 1) {
            return false;
        } else {
            // recurse through all subtrees
            return isBalanced(root.leftChild) || isBalanced(root.rightChild);
        }
    }
}
