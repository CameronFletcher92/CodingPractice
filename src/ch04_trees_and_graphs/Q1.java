package ch04_trees_and_graphs;

public class Q1 {
    private static int checkHeight(TreeNode n) {
        // base case: leaf node
        if (n.leftChild == null && n.rightChild == null) {
            return 1;
        }

        // get the heights of the left and right subtrees
        int leftHeight = n.leftChild != null ? checkHeight(n.leftChild) : 0;
        int rightHeight = n.rightChild != null ? checkHeight(n.rightChild) : 0;

        // check subtrees were balanced, and that the 2 subtrees height difference does not exceed 1
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
}
