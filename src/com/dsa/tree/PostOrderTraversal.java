package com.dsa.tree;

import com.dsa.node.Node;

public class PostOrderTraversal {

     public static void postOrderTraveral(Node<Integer> root){
        if(root == null) return;
        postOrderTraveral(root.back);
        postOrderTraveral(root.next);
        System.out.println(root.data);
    }
}
