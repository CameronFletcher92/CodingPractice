package ch04_trees_and_graphs;
import java.util.HashSet;
import java.util.LinkedList;

public class Q2 {
    public static boolean hasPath(GraphNode g1, GraphNode g2) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        HashSet<GraphNode> visited = new HashSet<>();
        queue.addLast(g1);

        while (!queue.isEmpty()) {
            GraphNode node = queue.removeFirst();

            // return true if we hit our destination
            if (node == g2) {
                return true;
            }

            // otherwise visit the node, and add all children
            visited.add(node);
            for (GraphNode n : node.nodes) {
                // skip visited node (to avoid possible loops
                if (visited.contains(n)) {
                    continue;
                }

                queue.addLast(n);
            }
        }

        return false;
    }
}
