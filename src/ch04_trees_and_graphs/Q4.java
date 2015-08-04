package ch04_trees_and_graphs;

import java.util.LinkedList;

public class Q4 {
    private static void createLists(TreeNode node, int depth, LinkedList<LinkedList<TreeNode>> lists) {
        // base case
        if (node == null)
            return;

        // get the depth list
        LinkedList<TreeNode> depthList;

        // if there isn't a linked list for that depth yet, add one
        if (lists.size() < (depth + 1)) {
            LinkedList<TreeNode> newList = new LinkedList<>();
            lists.add(depth, newList);
            depthList = newList;
        } else {
            depthList = lists.get(depth);
        }

        // add ourselves to the correct depth list
        depthList.add(node);

        // recurse through children at depth + 1
        createLists(node.leftChild, depth + 1, lists);
        createLists(node.rightChild, depth + 1, lists);
    }

    public static LinkedList<LinkedList<TreeNode>> createLists(TreeNode root) {
        LinkedList<LinkedList<TreeNode>> lists = new LinkedList<>();
        createLists(root, 0, lists);

        return lists;
    }
}
