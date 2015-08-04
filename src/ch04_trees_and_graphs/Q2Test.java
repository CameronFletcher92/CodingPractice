package ch04_trees_and_graphs;
import junit.framework.TestCase;

public class Q2Test extends TestCase {
    public void testHasRoute() throws Exception {
        GraphNode g1 = new GraphNode(1);
        GraphNode g2 = new GraphNode(2);
        GraphNode g3 = new GraphNode(3);
        GraphNode g4 = new GraphNode(4);
        GraphNode g5 = new GraphNode(5);
        GraphNode g6 = new GraphNode(6);
        GraphNode g7 = new GraphNode(7);
        GraphNode g8 = new GraphNode(8);

        g1.nodes.add(g2);
        g1.nodes.add(g3);

        g2.nodes.add(g4);
        g2.nodes.add(g5);
        g2.nodes.add(g6);

        g1.nodes.add(g6);

        assertTrue(Q2.hasPath(g1, g6));
        assertTrue(Q2.hasPath(g1, g5));
        assertTrue(Q2.hasPath(g1, g4));

        assertFalse(Q2.hasPath(g6, g1));
        assertFalse(Q2.hasPath(g5, g1));
        assertFalse(Q2.hasPath(g4, g1));

        assertFalse(Q2.hasPath(g1, g7));
        assertFalse(Q2.hasPath(g1, g8));
    }
}