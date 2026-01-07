package com.dsa.tree;

import com.dsa.node.Node;

public class ProblemsOnTree {
    

    public static int heightOfBinaryTree(Node<Integer> root){

        if(root == null) return 0;

        int lh = heightOfBinaryTree(root.back);
        int rh = heightOfBinaryTree(root.next);

        return Math.max(lh, rh)+1;
    }

    public static void nodeAtDistanceK(Node<Integer> root , int k){

        if(root != null){
            if(k==0){
                System.out.println(root.data);
            }else{ 
                nodeAtDistanceK(root.back, k-1);
                nodeAtDistanceK(root.next, k-1);
            }
        }
    }
}

