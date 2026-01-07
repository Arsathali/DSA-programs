package com.dsa.tree;
import com.dsa.queue.QueueLL;
import com.dsa.node.Node;

public class Bfs {
    
    public static void levelOrder(Node root){

        QueueLL<Node> queue = new QueueLL<>();
        
        //without line
        // if(root != null){
        //     queue.enQueue(root);
        //     while(!queue.isEmpty()){
        //         Node curr = queue.deQueue();
        //         System.out.println(curr.data);
        //         if(curr.back != null){
        //             queue.enQueue(curr.back);
        //         }
        //         if(curr.next != null){
        //             queue.enQueue(curr.next);
        //         }
        //     }
        // }

        //with line
        if(root != null){
            queue.enQueue(root);
            queue.enQueue(null);
            while(!queue.isEmpty()){
                
                Node curr = queue.deQueue();

                if(curr==null){
                    System.out.println();
                     if (!queue.isEmpty()) {   // critical condition
                        queue.enQueue(null);
                     }
                }else{
                    System.out.println(curr.data);
                    if(curr.back != null){
                        queue.enQueue(curr.back);
                    }
                    if(curr.next != null){
                        queue.enQueue(curr.next);
                    }
                }
            }
        }

        
    }
}
