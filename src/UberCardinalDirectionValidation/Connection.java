package UberCardinalDirectionValidation;

public class Connection{
    private Node from;
    private Node to;
    private String indir;
    public Connection(Node A, Node B, String dir){
        from = A;
        to = B;
        indir = dir;
    }

    public Node getFrom(){
        return from;
    }

    public Node getTo(){
        return to;
    }

    public String getDir(){
        return indir;
    }
}