package com.dsa.graph;
import java.util.ArrayList;
import java.util.List;

import com.dsa.list.MyLinkdedList;
import com.dsa.node.Node;
import com.dsa.queue.QueueLL;


public class Graph{

    private int vertices;
    private MyLinkdedList<MyLinkdedList<Integer>> adjList;

    public Graph(int vertices){
        this.vertices = vertices;
        this.adjList = new MyLinkdedList<>();

        for(int i=0; i<= vertices ; i++){
            this.adjList.addlast(new MyLinkdedList<>());
        }
    }
    //undirected graph
    public void addEdge(int u, int v){
        adjList.get(u).addlast(v);
        adjList.get(v).addlast(u);
    }

    public MyLinkdedList<MyLinkdedList<Integer>> getGraphAdjList(){
        return adjList;
    }

    // for directed graph
    // public void addEdge(int u, int v){
    //     adjList.get(u).add(v);
    // }

    public void printGraph(){
        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " -> ");
            Node<Integer> temp = adjList.get(i).getHead();
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void bfs(int src){

        boolean vis[] = new boolean[vertices+1];
        QueueLL<Integer> queue = new QueueLL<>();

        queue.enQueue(src);
        vis[src] = true;

        while(!queue.isEmpty()){

            int node = queue.deQueue();
            System.out.print(node +" ");

            Node<Integer> temp = adjList.get(node).getHead();
            while(temp!=null){
                int neigh = temp.data;
                if(!vis[neigh]){
                    vis[neigh] = true;
                    queue.enQueue(neigh);
                }
                temp=temp.next;
            }
        }
    }

    public void dfsTraversal(int src){
        boolean visited[] = new boolean[vertices+1];
        dfs(src, visited);
    }

    public void dfs(int v , boolean vis[]){
        System.out.print(v+" ");
        vis[v]=true;
        
        Node<Integer> temp = adjList.get(v).getHead();
        while (temp != null) {
            int neigh = temp.data;
            if (!vis[neigh]) {
                dfs(neigh, vis);
            }
            temp = temp.next;
        }
    }
}