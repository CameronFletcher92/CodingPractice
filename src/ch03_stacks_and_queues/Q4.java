package ch03_stacks_and_queues;

import java.util.Stack;

public class Q4 {
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
