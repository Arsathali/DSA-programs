package com.dsa.tree;

import com.dsa.node.Node;

public class PreOrderTraveral {
    
    public static void preOrderTraveral(Node<Integer> root){

        if(root == null) return;

        System.out.println(root.data);
        preOrderTraveral(root.back);
        preOrderTraveral(root.next);
    }
}
