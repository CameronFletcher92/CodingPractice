package ch04_trees_and_graphs;

public class Q7 {
    public static class Result {
        public int numFound;
        public TreeNode ancestor;

        public Result(int numFound, TreeNode ancestor) {
            this.numFound = numFound;
            this.ancestor = ancestor;
        }
    }

    public static TreeNode findCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        Result res = findAncestor(root, a, b);
        return res.ancestor;
    }


    private static Result findAncestor(TreeNode root, TreeNode a, TreeNode b) {
        // base case, none found
        if (root == null) {
            return new Result(0, null);
        }

        // check root
        int numFound = 0;
        if (root == a) {
            numFound++;
        }
        if (root == b) {
            numFound++;
        }

        // if both nodes are root, return it
        if (numFound == 2) {
            return new Result(2, root);
        }

        // recurse down the left side
        Result leftResult = findAncestor(root.leftChild, a, b);

        // we found the common ancestor (2 were in this subtree)
        if (leftResult.numFound == 2) {
            return leftResult;
        } else {
            numFound += leftResult.numFound;
        }

        // recurse down the right side
        Result rightResult = findAncestor(root.rightChild, a, b);

        // we found the common ancestor (2 were in this subtree)
        if (rightResult.numFound == 2) {
            return rightResult;
        } else {
            numFound += rightResult.numFound;
        }

        // if we found 2 nodes, and it hasn't been handled, root is common ancestor
        if (numFound == 2) {
            return new Result(2, root);
        } else {
            return new Result(numFound, null);
        }
    }

}
