package FitbitLinkedListRearrangement;

import java.util.ArrayList;

//This problem was asked by Fitbit.
//
//Given a linked list, rearrange the node values such that they appear in alternating low -> high -> low -> high ... form.
//For example, given 1 -> 2 -> 3 -> 4 -> 5, you should return 1 -> 3 -> 2 -> 5 -> 4.
public class RearrangeLinkedList {
    public static class Node{
        public int data;
        public Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public String toString(){
            if(this.next != null){
                return "[" + this.data + ", " + this.next.data + "]";
            }else{
                return "[" + this.data + ", null]";
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Node> ll = new ArrayList<Node>();
        Node e = new Node(5, null);
        Node d = new Node(4, e);
        Node c = new Node(3, d);
        Node b = new Node(2, c);
        Node a = new Node(1, b);

        ll.add(a);
        ll.add(b);
        ll.add(c);
        ll.add(d);
        ll.add(e);

        for(int i = 1; i <= ll.size()-2; i+=2){
            Node nextBuffer = ll.get(i).next;
            Node thisBuffer = ll.get(i);
            ll.set(i+1, thisBuffer);
            ll.set(i, nextBuffer);
        }

        for(int i = 0; i < ll.size()-1; i++){
            ll.get(i).next = ll.get(i+1);
        }

        ll.get(ll.size()-1).next = null;

        System.out.println(ll.toString());
    }
}
