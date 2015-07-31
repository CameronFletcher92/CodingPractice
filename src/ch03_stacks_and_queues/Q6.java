package ch03_stacks_and_queues;

public class Q6 {
    public static Stack<Integer> sortStack(Stack<Integer> s1) {
        Stack<Integer> s2 = new Stack<>();

        while (s1.peek() != null) {
            // get the top element of s1, and find where to place it in s2
            int tmp = s1.pop();

            // pop from s2 until we find the correct place for tmp
            while (s2.peek() != null && s2.peek() > tmp) {
                s1.push(s2.pop());
            }

            // push tmp onto s2 in the correct position
            s2.push(tmp);
        }

        return s2;
    }
}
