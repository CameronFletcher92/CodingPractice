package ch03_stacks_and_queues;

import java.util.ArrayList;

public class Q3 {
    public static class SetOfStacks {
        private ArrayList<Stack<Integer>> stacks;
        private int capacity;
        private int totalSize = 0;
        private Stack<Integer> last;
        private int lastSize;

        public SetOfStacks(int capacity) {
            this.capacity = capacity;
            lastSize = 0;

            stacks = new ArrayList<>();
        }

        public void push(Integer value) {
            if (last != null && lastSize < capacity) {
                last.push(value);
                lastSize++;
            } else {
                last = new Stack<>();
                stacks.add(last);
                last.push(value);
                lastSize = 1;
            }
        }

        public Integer peek() {
            if (stacks.size() == 0) {
                return null;
            }
            return last.peek();
        }

        public Integer pop() {
            if (stacks.size() == 0) {
                return null;
            }

            int val = last.pop();
            lastSize--;

            if (lastSize == 0) {
                stacks.remove(last);
                if (stacks.size() > 0) {
                    last = stacks.get(stacks.size() - 1);
                    lastSize = capacity;
                } else {
                    last = null;
                    lastSize = 0;
                }
            }

            return val;
        }
    }
}
