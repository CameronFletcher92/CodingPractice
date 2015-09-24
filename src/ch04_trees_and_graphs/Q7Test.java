package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q7Test extends TestCase {
    public void testFindCommonAncestor() throws Exception {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        TreeNode notIn = new TreeNode(20);

        t4.leftChild = t2;
        t4.rightChild = t6;

        t2.leftChild = t1;
        t2.rightChild = t3;

        t6.leftChild = t5;
        t6.rightChild = t7;

        assertEquals(t6, Q7.findCommonAncestor(t4, t5, t7));
        assertEquals(t2, Q7.findCommonAncestor(t4, t1, t3));
        assertEquals(t4, Q7.findCommonAncestor(t4, t5, t1));
        assertEquals(t4, Q7.findCommonAncestor(t4, t2, t7));
        assertEquals(null, Q7.findCommonAncestor(t4, notIn, t7));
    }
}