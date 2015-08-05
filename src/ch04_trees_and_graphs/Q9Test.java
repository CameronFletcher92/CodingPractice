package ch04_trees_and_graphs;
import junit.framework.TestCase;

import java.util.ArrayList;

public class Q9Test extends TestCase {
    public void testGetPathsForSum() throws Exception {
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(2);
        TreeNode t7 = new TreeNode(1);
        TreeNode t8 = new TreeNode(1);
        TreeNode t9 = new TreeNode(1);
        TreeNode t10 = new TreeNode(1);

        t1.leftChild = t2;
        t2.leftChild = t3;

        t1.rightChild = t4;
        t4.leftChild = t5;
        t5.leftChild = t6;

        t4.rightChild = t7;
        t7.rightChild = t8;
        t8.rightChild = t9;
        t9.rightChild = t10;

        ArrayList<ArrayList<Integer>> paths = Q9.findSum(t1, 5);
        assertEquals(5, paths.size());

    }
}