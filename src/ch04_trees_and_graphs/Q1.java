package ch04_trees_and_graphs;

public class Q1 {
    private static int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // get the subtree heights
        int leftHeight = checkHeight(root.leftChild);
        int rightHeight = checkHeight(root.rightChild);

        // if either subtree is unbalanced, this subtree is unbalanced
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        // check if this subtree is unbalanced, otherwise return the subtree's height
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if (heightDiff > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
}
