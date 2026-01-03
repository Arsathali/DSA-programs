package com.dsa.list;
import com.dsa.node.Node;

public class MyLinkdedList<T> {
    
     Node<T> head;
     int size;

     public MyLinkdedList(){
        head = null;
        size =0;
     }
    
     //adding in first
     public void addfirst(T data){ 
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
     }

     //adding in last
     public void addlast(T data){
        Node<T> newNode = new Node<T>(data);
        if(size==0){
            head = newNode;
        }else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
     }

     //remove first
     public T removefirst(){

        if(size==0){
            return null;
        }else{
            T dataT = head.data;
            head = head.next;
            size--;
            return dataT;
        }
     }

     //getfirst value
     public T getFirst(){
        return size == 0 ? null : head.data;
     }

     //getLast value
     public T getlast(){
        if(size==0) return null;
        Node<T> temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
       
     }
     //isEmpty
     public boolean isEmpty(){
        return size == 0;
     }

     //size
     public int  size(){
        return size;
     }
}
