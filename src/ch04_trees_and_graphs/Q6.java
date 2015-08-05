package ch04_trees_and_graphs;

public class Q6 {
    public static TreeNode findNextNode(TreeNode node) {
        TreeNode ret;

        // if we have a right child, recurse to its leftmost descendant
        if (node.rightChild != null) {
            ret = node.rightChild;
            while (ret.leftChild != null) {
                ret = ret.leftChild;
            }
            return ret;
        }

        // if we have a parent whose value is >= our own, return that
        if (node.parent != null && node.parent.data >= node.data) {
            return node.parent;
        }

        // if we have a parent whose value is < our own, recurse up the tree until we find null or value >= our own
        if (node.parent != null && node.parent.data < node.data){
            ret = node.parent;
            while (ret != null && ret.data < node.data) {
                ret = ret.parent;
            }
            return ret;
        }

        // should never hit
        return null;
    }
}
