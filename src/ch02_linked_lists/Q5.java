package ch02_linked_lists;

public class Q5 {
    private static LinkedList<Integer> reverseSum(LinkedList.Node m, LinkedList.Node n, LinkedList<Integer> result, int carry) {
        int sum;
        int newCarry;

        if (m != null || n != null) {
            sum = (m == null ? 0 : (int)m.data) + (n == null ? 0 : (int)n.data) + carry;
            newCarry = sum > 10 ? 1 : 0;
            result.append(sum % 10);
            reverseSum(m == null ? null : m.next, n == null ? null : n.next, result, newCarry);
        }

        return result;
    }

    public static LinkedList<Integer> reverseSum(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        return reverseSum(list1.head, list2.head, result, 0);
    }


    private static int sum(LinkedList.Node m, LinkedList.Node n, LinkedList<Integer> result) {
        int sum = 0;
        if (m != null && n != null) {
            sum = (int)m.data + (int)n.data + sum(m.next, n.next, result);
            result.prepend(sum % 10);
        }

        return sum > 10 ? 1 : 0;
    }


    public static LinkedList<Integer> sum(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<Integer> smaller;
        int numPadding = 0;

        // pad smaller list with 0s
        if (list1.length() != list2.length()) {
            if (list1.length() < list2.length()) {
                numPadding = list2.length() - list1.length();
                smaller = list1;
            } else {
                numPadding = list1.length() - list2.length();
                smaller = list1;
            }

            for (int i = 0; i < numPadding; i++) {
                smaller.prepend(0);
            }
        }

        // recursive sum
        sum(list1.head, list2.head, result);
        return result;
    }
}
