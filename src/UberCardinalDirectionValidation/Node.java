package UberCardinalDirectionValidation;

import java.util.ArrayList;

public class Node{
    private char ID;
    private ArrayList<Connection> connections;
    public Node(char c){
        ID = c;
        connections = new ArrayList<Connection>();
    }

    public void addConnection(Node connectTo, String dir){
        connections.add(new Connection(this, connectTo, dir));
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public char getID(){
        return ID;
    }
}