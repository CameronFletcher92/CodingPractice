package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q3Test extends TestCase {

    public void testCreateMinimalBST() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        TreeNode root = Q3.createMinimalBST(nums);

        assertEquals(root.data, 5);

        assertEquals(root.leftChild.data, 2);
        assertEquals(root.rightChild.data, 7);

        assertEquals(root.leftChild.leftChild.data, 1);
        assertEquals(root.leftChild.rightChild.data, 3);

        assertEquals(root.rightChild.leftChild.data, 6);
        assertEquals(root.rightChild.rightChild.data, 8);

        assertEquals(root.leftChild.rightChild.rightChild.data, 4);
        assertEquals(root.rightChild.rightChild.rightChild.data, 9);

        nums = new int[]{1, 2, 3, 4, 5, 6};

        root = Q3.createMinimalBST(nums);

        assertEquals(root.data, 3);
        assertEquals(root.leftChild.data, 1);
        assertEquals(root.leftChild.rightChild.data, 2);

        assertEquals(root.rightChild.data, 5);
        assertEquals(root.rightChild.leftChild.data, 4);
        assertEquals(root.rightChild.rightChild.data, 6);
    }

}