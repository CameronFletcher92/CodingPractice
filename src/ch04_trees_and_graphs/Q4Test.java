package ch04_trees_and_graphs;
import junit.framework.TestCase;

import java.util.LinkedList;

public class Q4Test extends TestCase {
    public void testCreateLists() {
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

        LinkedList<LinkedList<TreeNode>> lists = Q4.createLists(root);

        LinkedList<TreeNode> depth0 = lists.get(0);
        assertTrue(depth0.contains(root));

        LinkedList<TreeNode> depth1 = lists.get(1);
        assertTrue(depth1.contains(t1));
        assertTrue(depth1.contains(t2));

        LinkedList<TreeNode> depth2 = lists.get(2);
        assertTrue(depth2.contains(t3));
        assertTrue(depth2.contains(t4));
        assertTrue(depth2.contains(t5));
        assertTrue(depth2.contains(t6));

    }

}