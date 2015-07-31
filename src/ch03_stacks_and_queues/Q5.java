package ch03_stacks_and_queues;

public class Q5 {
    public static class MyQueue {
        public Stack<Integer> newest;
        public Stack<Integer> oldest;

        public MyQueue() {
            newest = new Stack<>();
            oldest = new Stack<>();
        }

        public void enqueue(Integer item) {
            newest.push(item);
        }

        public Integer dequeue() {
            if (oldest.peek() != null) {
                return oldest.pop();
            } else {
                while (newest.peek() != null) {
                    oldest.push(newest.pop());
                }
                return oldest.pop();
            }
        }
    }
}
