package ch03_stacks_and_queues;

public class Q2 {
    public static class MinStack extends Stack<Integer>{
        private Stack<Integer> mins;

        public MinStack() {
            super();
            mins = new Stack<>();
        }

        public Integer getMin() {
            return mins.peek();
        }

        public void push(int value) {
            super.push(value);
            if (mins.peek() == null || value < mins.peek()) {
                mins.push(value);
            }
        }

        public Integer pop() {
            Integer val = super.pop();
            if (val == null) {
                return null;
            }

            // pop the min off if it is this value
            if (mins.peek() == val) {
                mins.pop();
            }

            return val;
        }
    }
}
