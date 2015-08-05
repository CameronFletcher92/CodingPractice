package ch04_trees_and_graphs;

public class Q7 {
    private static boolean isDescendant(TreeNode root, TreeNode t) {
        if (root == null)
            return false;

        if (root == t) {
            return true;
        }

        return isDescendant(root.leftChild, t) || isDescendant(root.rightChild, t);
    }

    private static TreeNode findCommonAncestorHelper(TreeNode root, TreeNode t1, TreeNode t2) {
        boolean isT1OnLeft = isDescendant(root.leftChild, t1);
        boolean isT2OnLeft = isDescendant(root.leftChild, t2);

        if (isT1OnLeft && isT2OnLeft) {
            return findCommonAncestorHelper(root.leftChild, t1, t2);
        } else if (!isT1OnLeft && !isT2OnLeft) {
            return findCommonAncestorHelper(root.rightChild, t1, t2);
        } else {
            return root;
        }
    }

    public static TreeNode findCommonAncestor(TreeNode root, TreeNode t1, TreeNode t2) {
        if (!isDescendant(root, t1) || !isDescendant(root, t2)) {
            return null;
        } else {
            return findCommonAncestorHelper(root, t1, t2);
        }
    }
}
