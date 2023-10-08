package LinkedinBinarySearchTree;

/**
 * Determine whether a tree is a valid binary search tree.
 *
 * A binary search tree is a tree with two children, left and right, and satisfies the constraint
 * that the key in the left child must be less than or equal to the root and the key in the right
 * child must be greater than or equal to the root.
 */
public class ValidateBST {
    class Node{
        public Node leftChild;
        public Node rightChild;
        public int key;
    }

    public boolean validate(Node root){
        if(root.leftChild != null){
            if(root.leftChild.key <= root.key){
                return validate(root.leftChild);
            }else return false;
        }
        if(root.rightChild != null){
            if(root.rightChild.key >= root.key){
                return validate(root.rightChild);
            }else return false;
        }
        return true;
    }
}
