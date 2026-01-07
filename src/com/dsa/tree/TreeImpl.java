package com.dsa.tree;
import com.dsa.node.Node;

public class TreeImpl<T> {
    
    Node<Integer> root;

    public TreeImpl(int data){
       this.root = new Node<>(data);
    }

   public Node<Integer> treeImpl(){
      
        root.back = new Node<>(6);
        root.back.back = new Node<>(7);
        root.back.next = new Node<>(8);

        root.next = new Node<>(9);
        root.next.back = new Node<>(10);
        root.next.next = new Node<>(11);

        return root;
   }
}
