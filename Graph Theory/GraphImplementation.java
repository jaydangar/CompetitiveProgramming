import java.util.ArrayList;

class GraphImplementation {

    static void insert(ArrayList<ArrayList<Integer>> graph,int verticeDestination,int newVertice){
        graph.get(verticeDestination).add(newVertice);
        //  for undirected graph viceversa is also true
        graph.get(newVertice).add(verticeDestination);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Integer> connectedNodes = graph.get(i);
            System.out.print(i);
            for (int j = 0; j < connectedNodes.size(); j++) {
                System.out.print(" " + connectedNodes.get(j) + "->");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
 
        insert(graph,0,1);
        insert(graph,0,4);
        insert(graph,1,2);
        insert(graph,1,3);
        insert(graph,1,4);
        insert(graph,2,3);
        insert(graph,3,4);
        
        printGraph(graph);
    }
}