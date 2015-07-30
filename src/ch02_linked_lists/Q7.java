package ch02_linked_lists;

import java.util.Stack;

public class Q7 {
    public static <E> boolean isPalindrome(LinkedList<E> list) {
        LinkedList.Node slow = list.head;
        LinkedList.Node fast = list.head;

        Stack<E> stack = new Stack<>();

        // push first half onto a stack
        while (fast != null && fast.next != null) {
            stack.push((E)slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // has odd number of elements, skip middle elem
        if (fast != null) {
            slow = slow.next;
        }

        // compare second half of the list to the stack
        while (slow != null) {
            if (!slow.data.equals(stack.pop())) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
