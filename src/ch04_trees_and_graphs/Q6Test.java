package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q6Test extends TestCase {
    public void testFindNextNode() throws Exception {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t4.leftChild = t2;
        t2.parent = t4;

        t4.rightChild = t6;
        t6.parent = t4;

        t2.leftChild = t1;
        t1.parent = t2;

        t2.rightChild = t3;
        t3.parent = t2;

        t6.leftChild = t5;
        t5.parent = t6;

        t6.rightChild = t7;
        t7.parent = t6;

        assertEquals(t2, Q6.findNextNode(t1));
        assertEquals(t3, Q6.findNextNode(t2));
        assertEquals(t4, Q6.findNextNode(t3));
        assertEquals(t5, Q6.findNextNode(t4));
        assertEquals(t6, Q6.findNextNode(t5));
        assertEquals(t7, Q6.findNextNode(t6));
        assertEquals(null, Q6.nextNode(t7));
    }

}