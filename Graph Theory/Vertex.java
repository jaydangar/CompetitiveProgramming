import java.util.ArrayList;

public class Vertex {

    private boolean isTraversed = false;
    private int value;
    private ArrayList<Vertex> connectedNodes = new ArrayList<>();

    Vertex(){

    }

    Vertex(int value) {
        this.value = value;
    }

    public boolean isTraversed() {
        return isTraversed;
    }

    public void setTraversed(boolean isTraversed) {
        this.isTraversed = isTraversed;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Vertex> getConnectedNodes() {
        return connectedNodes;
    }

    public void setConnectedNodes(Vertex connectedNodes) {
        this.connectedNodes.add(connectedNodes);
    }

    
}