package ch04_trees_and_graphs;

public class Q3 {
    private static TreeNode createMinimalBST(int[] nums, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.leftChild = createMinimalBST(nums, start, mid - 1);
        root.rightChild = createMinimalBST(nums, mid + 1, end);

        return root;
    }

    public static TreeNode createMinimalBST(int[] nums) {
        return createMinimalBST(nums, 0, nums.length - 1);
    }

}
