package ch02_linked_lists;

public class Q4 {
    public static <E> LinkedList<E> partition(LinkedList<E> list, int x) {
        LinkedList<E> result = new LinkedList<>();
        LinkedList.Node n = list.head;

        while (n != null) {
            if (!(n.data instanceof Integer)) {
                System.out.println("not an integer");
            } else {
                if ((int)n.data < x) {
                    // prepend
                    result.prepend((E)n.data);
                } else {
                    // append
                    result.append((E)n.data);
                }
            }
            n = n.next;
        }

        return result;
    }
}
