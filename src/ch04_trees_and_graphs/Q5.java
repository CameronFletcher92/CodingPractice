package ch04_trees_and_graphs;

public class Q5 {
    private static boolean isBinarySearchTree(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }


        // get the values
        Integer rootVal = root.data;
        Integer leftVal = root.leftChild != null ? root.leftChild.data : null;
        Integer rightVal = root.rightChild != null ? root.rightChild.data : null;

        // check the root is in the right range
        if ((min != null && rootVal < min) || (max != null && rootVal >= max)) {
            return false;
        }

        // binary search tree check
        if ((leftVal != null && leftVal > rootVal) || (rightVal != null && rightVal <= rootVal)) {
            return false;
        } else {
            return isBinarySearchTree(root.leftChild, min, rootVal) && isBinarySearchTree(root.rightChild, rootVal, max);
        }
    }

    public static boolean isBinarySearchTree(TreeNode root) {
        return isBinarySearchTree(root, null, null);
    }
}
