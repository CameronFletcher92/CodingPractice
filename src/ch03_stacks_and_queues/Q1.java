package ch03_stacks_and_queues;

public class Q1 {
    public static class TripleStack {
        private int[] stackArray;
        private int stackSize;

        private int[] stackPointers;
        private int[] stackSizes;

        public TripleStack(int stackSize) {
            this.stackSize = stackSize;
            this.stackArray = new int[stackSize * 3];
            this.stackPointers = new int[]{-1, stackSize - 1, (stackSize * 2) - 1};
            this.stackSizes = new int[]{0, 0, 0};
        }

        public void push(int stackNum, int value) {
            if (stackSizes[stackNum] > stackSize) {
                System.out.println("stack exceeded allocated space");
                return;
            }

            stackPointers[stackNum]++;
            stackSizes[stackNum]++;
            stackArray[stackPointers[stackNum]] = value;
        }

        public Integer pop(int stackNum) {
            if (stackSizes[stackNum] <= 0) {
                return null;
            } else {
                int val = stackArray[stackPointers[stackNum]];
                stackPointers[stackNum]--;
                stackSizes[stackNum]--;
                return val;
            }
        }

        public Integer peek(int stackNum) {
            if (stackSizes[stackNum] <= 0) {
                return null;
            } else {
                return stackArray[stackPointers[stackNum]];
            }
        }
    }

}
