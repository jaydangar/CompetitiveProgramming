import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeightedGraphImplementation {

    static void insert(Map<Integer,Vertex> graph,int vertexValue,int connectedVertexValue){
        Vertex vertex;
        ArrayList<Vertex> connectedNodes;
        Vertex connectedVertex = new Vertex(connectedVertexValue);
        
        if(!graph.containsKey(connectedVertexValue)){
            graph.put(connectedVertexValue, connectedVertex);
        }

        if(graph.containsKey(vertexValue)){
            vertex = graph.get(vertexValue);
            connectedNodes = vertex.getConnectedNodes();
            connectedNodes.add(connectedVertex);
            graph.put(vertexValue,vertex);
            return;
        }

        vertex = new Vertex(vertexValue);
        connectedNodes = vertex.getConnectedNodes();
        connectedNodes.add(connectedVertex);
        graph.put(vertexValue, vertex);
    }

    public static void main(String[] args) {
        
        Map<Integer,Vertex> graph = new HashMap<Integer,Vertex>();
        insert(graph, 0, 1);
        // insert(graph, 1, 2);
        insert(graph, 2, 3);
        insert(graph, 3, 4);
        insert(graph, 3, 1);
        insert(graph, 4, 0);
        insert(graph, 4, 1);
        insert(graph, 7, 2);

        // insert(graph, 0, 5);
        // insert(graph, 5, 3);
        // insert(graph, 5, 7);

        // printGraph(graph);
        printDFS(graph);
    }

    private static void printDFS(Map<Integer, Vertex> graph) {
        printDFSHelper(graph,4);    
 	}

    static void printDFSHelper(Map<Integer,Vertex> graph, int key){
        Vertex vertex = graph.get(key);

        if(vertex==null){
            return;
        }

        if(vertex.isTraversed()){
            return;
        }

        vertex.setTraversed(true);
        System.out.println(vertex.getValue());
        ArrayList<Vertex> connectedNodes = vertex.getConnectedNodes();
        for (Vertex connectedNode : connectedNodes) {
            printDFSHelper(graph,connectedNode.getValue());
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