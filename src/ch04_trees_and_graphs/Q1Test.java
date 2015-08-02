package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q1Test extends TestCase {
    public void testIsBalanced() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        // construct a balanced tree;
        TreeNode root = new TreeNode(0);

        // level 1
        root.leftChild = t1;
        root.rightChild = t2;

        // level 2
        root.leftChild.leftChild = t3;
        root.leftChild.rightChild = t4;
        root.rightChild.leftChild = t5;
        root.rightChild.rightChild = t6;

        assertTrue(Q1.isBalanced(root));

        // construct a non-balanced tree;
        root = new TreeNode(0);

        // level 1
        root.leftChild = t1;

        // level 2
        root.leftChild.leftChild = t3;
        root.leftChild.rightChild = t4;
        root.leftChild.leftChild.leftChild = t5;
        root.leftChild.leftChild.rightChild = t6;

        assertFalse(Q1.isBalanced(root));
    }
}