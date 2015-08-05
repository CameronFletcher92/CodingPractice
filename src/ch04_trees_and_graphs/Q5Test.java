package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q5Test extends TestCase {
    public void testIsBinarySearchTree() throws Exception {
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

        assertTrue(Q5.isBinarySearchTree(t4));

        t6.leftChild = t7;
        t6.rightChild = t5;

        assertFalse(Q5.isBinarySearchTree(t4));

        t1 = new TreeNode(1);
        t2 = new TreeNode(2);
        t3 = new TreeNode(3);
        t4 = new TreeNode(4);
        t5 = new TreeNode(5);
        t6 = new TreeNode(6);
        t7 = new TreeNode(7);

        t7.leftChild = t6;
        t6.leftChild = t5;
        t5.leftChild = t4;
        t4.leftChild = t3;
        t3.leftChild = t2;
        t2.leftChild = t1;

        assertTrue(Q5.isBinarySearchTree(t4));


        TreeNode t10 = new TreeNode(10);
        TreeNode t20 = new TreeNode(20);
        TreeNode t25 = new TreeNode(25);
        TreeNode t30 = new TreeNode(30);

        t20.leftChild = t10;
        t20.rightChild = t30;
        t10.rightChild = t25;

        assertFalse(Q5.isBinarySearchTree(t20));

        t10 = new TreeNode(10);
        t20 = new TreeNode(20);
        t25 = new TreeNode(25);
        t30 = new TreeNode(30);

        t20.leftChild = t10;
        t20.rightChild = t30;
        t30.leftChild = t25;

        assertTrue(Q5.isBinarySearchTree(t20));

    }
}