package UberCardinalDirectionValidation;

public class Validate{
    public static void main(String[] args){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');

        A.addConnection(B, "N");

        B.addConnection(C, "NE");
        A.addConnection(C, "NNE");

        C.addConnection(A, "N");
    }
}