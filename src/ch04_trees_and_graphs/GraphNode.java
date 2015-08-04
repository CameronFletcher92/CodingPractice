package ch04_trees_and_graphs;

import java.util.ArrayList;

public class GraphNode {
    public ArrayList<GraphNode> nodes;
    public int data;

    public GraphNode(int data) {
        this.data = data;
        nodes = new ArrayList<>();
    }

    public String toString() {
        return "data: " + this.data + ", nodes: " + this.nodes;
    }
}
