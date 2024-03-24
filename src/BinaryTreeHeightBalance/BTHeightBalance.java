package BinaryTreeHeightBalance;

import org.w3c.dom.Node;

public class BTHeightBalance {
    public boolean isBalanced(Node root){
        int leftDepth = branchDepth(root.getChildNodes().item(0));
        int rightDepth = branchDepth(root.getChildNodes().item(1));
        if(leftDepth != rightDepth){
            if(Math.abs(leftDepth-rightDepth) > 1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return true;
        }
    }

    public static int branchDepth(Node root){
        return 0;
    }
}
