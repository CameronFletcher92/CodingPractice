package ch11_sorting_and_searching;

public class Q8 {
    public static class RankNode {
        public int value;
        public int leftSize;

        public RankNode left;
        public RankNode right;

        public RankNode(int value) {
            this.value = value;
            this.leftSize = 0;
        }

        public void insert(int value) {
            if (value > this.value && this.right == null) {
                this.right = new RankNode(value);
            }

            else if (value > this.value && this.right != null) {
                this.right.insert(value);
            }

            else if (value <= this.value && this.left == null) {
                this.left = new RankNode(value);
                leftSize++;
            }

            else if (value <= this.value && this.left != null) {
                this.left.insert(value);
                leftSize++;
            }
        }

        public int getRank(int value) {
            if (value == this.value) {
                return leftSize;
            } else if (value < this.value) {
                // search left
                if (left == null) {
                    return -1;
                } else {
                    return left.getRank(value);
                }
            } else {
                // search right
                // check the right node exists
                if (right == null) {
                    return -1;
                }

                // check the element is actually found on the right
                int rightRank = right.getRank(value);
                if (rightRank == -1) {
                    return -1;
                }

                // return in order traversal of the rank
                return this.leftSize + 1 + right.getRank(value);
            }
        }
    }

    public static class Tracker {
        private RankNode root;

        public int getRankOfNumber(int num) {
            if (root == null) {
                return 0;
            }

            return root.getRank(num);
        }

        public void track(int num) {
            if (root == null) {
                root = new RankNode(num);
            } else {
                root.insert(num);
            }
        }
    }

}
