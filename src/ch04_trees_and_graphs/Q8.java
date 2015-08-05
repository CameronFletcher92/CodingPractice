package ch04_trees_and_graphs;

public class Q8 {
    private static boolean treeMatch(TreeNode t1, TreeNode t2) {
        // null cases
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 != null && t2 == null) {
            return false;
        } else if (t1 == null && t2 != null) {
            return false;
        }

        if (t1.data == t2.data) {
            return treeMatch(t1.leftChild, t2.leftChild) && treeMatch(t1.rightChild, t2.rightChild);
        } else {
            return false;
        }
    }

    public static boolean isSubTree(TreeNode big, TreeNode small) {
        if (treeMatch(big, small)) {
            return true;
        } else {
            return treeMatch(big.leftChild, small) || treeMatch(big.rightChild, small);
        }
    }
}
