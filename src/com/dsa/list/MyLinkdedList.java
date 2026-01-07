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

     //add at particular index

     public void addAtIndex_k(int index,T dataT){

        if (index < 0 || index > size) {
            System.err.println("Invalid index");
            return;
        }

        if(isEmpty()){
            addfirst(dataT);
            return;
        }

        if(index == size){
            addlast(dataT);
            return;
        }

        Node<T> newNode = new Node<T>(dataT);
        int count = 0;
        Node<T> temp = head;

        while(temp != null && count != index-1){
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

     //removing last
     public T removeLast(){

        if(isEmpty()){
            return null;
        }
        //only one ele
        if(head.next == null){
            T data = head.data;
            head = null;
            size--;
            return data;
        }

        //more than one ele
        Node<T> temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        T data = temp.next.data;
        temp.next = null;
        size--;
        return data;
     }

     //removing at index

     public T removeAtIndex(int index){

        if(isEmpty()){
            return null;
        }

        if(index < 0 || index > size){
            System.err.println("Invalid index");
            return null;
        }

         if (index == 0) {
             return removefirst();
         }

        Node<T> temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }

        T data = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return data;
     }

    public T get(int node) {
        if (node < 0 || node >= size) return null;
        Node<T> temp = head;
        for (int i = 0; i < node; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // get head node (for traversal)
    public Node<T> getHead() {
        return head;
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
