package com.dsa.tree;
import com.dsa.node.Node;

public class InorderTraversal {
    
    public static void inorderTraversal(Node<Integer> root){

        if(root == null) return;
        
        inorderTraversal(root.back);
        System.out.println(root.data);
        inorderTraversal(root.next);
    }
}
