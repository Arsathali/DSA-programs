package com.dsa.app;

import com.dsa.node.Node;
import com.dsa.tree.Bfs;
import com.dsa.tree.InorderTraversal;
import com.dsa.tree.ProblemsOnTree;
import com.dsa.tree.TreeImpl;
import com.dsa.graph.Graph;

public class MyApp {
    
    public static void main(String[] args){

        //graphs driver code
        Graph graph = new Graph(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.printGraph();
        System.out.println();
        graph.bfs(1);
    }
}
