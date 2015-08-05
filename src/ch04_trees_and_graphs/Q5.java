package ch04_trees_and_graphs;

public class Q5 {
    private static boolean isBinarySearchTree(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        // get the root value
        Integer rootVal = root.data;

        // check the root is in the right range
        if ((min != null && rootVal < min) || (max != null && rootVal >= max)) {
            return false;
        } else {
            return isBinarySearchTree(root.leftChild, min, rootVal) && isBinarySearchTree(root.rightChild, rootVal, max);
        }
    }

    public static boolean isBinarySearchTree(TreeNode root) {
        return isBinarySearchTree(root, null, null);
    }
}
