package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q8Test extends TestCase {
    public void testIsSubTree() throws Exception {
        // big tree
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t4.leftChild = t2;
        t4.rightChild = t6;

        t2.leftChild = t1;
        t2.rightChild = t3;

        t6.leftChild = t5;
        t6.rightChild = t7;

        // small tree
        TreeNode t5copy = new TreeNode(5);
        TreeNode t6copy = new TreeNode(6);
        TreeNode t7copy = new TreeNode(7);

        t6copy.leftChild = t5copy;
        t6copy.rightChild = t7copy;

        assertTrue(Q8.isSubTree(t4, t6copy));

        t7copy.data = 9;
        assertFalse(Q8.isSubTree(t4, t6copy));
    }
}