package Tubes;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public void addVertex(String vertex) {
        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(String vertex1, String vertex2) {
        if (graph.containsKey(vertex1) && graph.containsKey(vertex2)) {
            if (!graph.get(vertex1).contains(vertex2)) {
                graph.get(vertex1).add(vertex2);
            }
        }
    }

    public void displayGraph() {
        for (String vertex : graph.keySet()) {
            System.out.println(vertex + " -> " + String.join(", ", graph.get(vertex)));
        }
    }
}
