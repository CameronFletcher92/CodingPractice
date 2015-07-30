package ch02_linked_lists;

import java.util.HashSet;

public class Q6 {
    public static LinkedList.Node detectLoop(LinkedList.Node head) {
        HashSet<LinkedList.Node> set = new HashSet<>();
        LinkedList.Node n = head;
        while (n != null) {
            if (set.contains(n)) {
                return n;
            }
            set.add(n);
            n = n.next;
        }

        return null;
    }

    public static LinkedList.Node detectLoopRunner(LinkedList.Node head) {
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        // get collision point
        while(fast != null && fast.next != null) {
            // move fast forward 2 steps
            fast = fast.next.next;

            // move slow forward 1 step
            slow = slow.next;

            // detect collision
            if (fast == slow) {
                break;
            }
        }

        // check there was actually a loop
        if (fast == null || fast.next == null) {
            return null;
        }

        // move fast back to head
        fast = head;

        // move them both at same speed until next collision
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
