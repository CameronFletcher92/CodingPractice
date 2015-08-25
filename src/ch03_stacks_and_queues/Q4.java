package ch03_stacks_and_queues;

import java.util.Stack;

public class Q4 {
    public static class TowersOfHanoi {
        private Stack<Integer> s1;
        private Stack<Integer> s2;
        private Stack<Integer> s3;

        public TowersOfHanoi(int num) {
            s1 = new Stack<>();
            s2 = new Stack<>();
            s3 = new Stack<>();

            for (int i = num; i > 0; i--) {
                s1.push(i);
            }
        }

        private void moveTower(Stack<Integer> source, Stack<Integer> dest, Stack<Integer> buf, int disks) {
            // base case: 1 disk
            if (disks == 1) {
                dest.push(source.pop());
                return;
            }

            // general case
            // move all but 1 disk to buf, using dest as buffer
            moveTower(source, buf, dest, disks - 1);

            // move bottom to dest
            moveTower(source, dest, buf, 1);

            // move the rest to dest using source as buffer
            moveTower(buf, dest, source, disks - 1);
        }

        public void solve() {
            moveTower(s1, s3, s2, s1.size());
        }
    }



    public static class Tower {
        private Stack<Integer> disks;
        private int index;

        public Tower(int i) {
            disks = new Stack<>();
            index = i;
        }

        public int getIndex() {
            return index;
        }

        public Stack<Integer> getDisks() {
            return disks;
        }

        public void add(int d) {
            if (!disks.isEmpty() && disks.peek() <= d) {
                System.out.println("Error placing disk " + d);
            } else {
                disks.push(d);
            }
        }

        public void moveTopTo(Tower t) {
            int top = disks.pop();
            t.add(top);
            System.out.println("Move disk " + top + " from " + getIndex() + " to " + t.getIndex());
        }

        public void moveDisks(int numDisks, Tower destination, Tower buffer) {
            if (numDisks > 0) {
                moveDisks(numDisks - 1, buffer, destination);
                moveTopTo(destination);
                buffer.moveDisks(numDisks - 1, destination, this);
            }
        }

    }

}
