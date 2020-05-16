import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class WeightedGraphImplementation {

    static void insert(Map<Integer, Vertex> graph, int vertexValue, int connectedVertexValue) {
        Vertex vertex;
        ArrayList<Vertex> connectedNodes;
        Vertex connectedVertex = new Vertex(connectedVertexValue);

        if (!graph.containsKey(connectedVertexValue)) {
            graph.put(connectedVertexValue, connectedVertex);
        }

        if (graph.containsKey(vertexValue)) {
            vertex = graph.get(vertexValue);
            connectedNodes = vertex.getConnectedNodes();
            connectedNodes.add(connectedVertex);
            graph.put(vertexValue, vertex);
            return;
        }

        vertex = new Vertex(vertexValue);
        connectedNodes = vertex.getConnectedNodes();
        connectedNodes.add(connectedVertex);
        graph.put(vertexValue, vertex);
    }

    public static void main(String[] args) {

        Map<Integer, Vertex> graph = new HashMap<Integer, Vertex>();
        // insert(graph, 0, 1);
        // insert(graph, 1, 2);
        // insert(graph, 1, 7);
        // insert(graph, 2, 3);
        // insert(graph, 3, 4);
        // insert(graph, 3, 1);
        // insert(graph, 4, 0);
        // insert(graph, 4, 1);
        // insert(graph, 7, 2);

        insert(graph, 0, 5);
        insert(graph, 5, 0);
        insert(graph, 5, 3);
        insert(graph, 3, 5);
        insert(graph, 5, 7);

        // printGraph(graph);
        // printDFS(graph);
        printBFS(graph);
    }

    private static void printBFS(Map<Integer, Vertex> graph) {
        int startIndex = 3;
        printBFSHelper(graph, startIndex);
    }

    private static void printBFSHelper(Map<Integer, Vertex> graph, int startIndex) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(graph.get(startIndex));
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            if (!vertex.isTraversed()) {
                System.out.print(vertex.getValue() + " ");
                vertex.setTraversed(true);
                ArrayList<Vertex> connectedNodes = vertex.getConnectedNodes();
                for (Vertex connectedNode : connectedNodes) {
                    queue.add(graph.get(connectedNode.getValue()));
                }
            }
        }
    }

    private static void printDFS(Map<Integer, Vertex> graph) {
        printDFSHelper(graph, 4);
    }

    static void printDFSHelper(Map<Integer, Vertex> graph, int key) {
        Vertex vertex = graph.get(key);

        if (vertex == null) {
            return;
        }

        if (vertex.isTraversed()) {
            return;
        }

        vertex.setTraversed(true);
        System.out.println(vertex.getValue());
        ArrayList<Vertex> connectedNodes = vertex.getConnectedNodes();
        for (Vertex connectedNode : connectedNodes) {
            printDFSHelper(graph, connectedNode.getValue());
        }
    }

    private static void printGraph(Map<Integer, Vertex> graph) {
        Set<Integer> keys = graph.keySet();
        for (Integer key : keys) {
            Vertex vertex = graph.get(key);
            System.out.println("For vertex " + vertex.getValue() + " connected vertices are --> ");
            ArrayList<Vertex> connectedVertices = vertex.getConnectedNodes();
            for (Vertex connectedVertex : connectedVertices) {
                System.out.print(connectedVertex.getValue() + " ");
            }
            System.out.println("");
        }
    }
}