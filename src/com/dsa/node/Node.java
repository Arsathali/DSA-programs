package com.dsa.node;

public class Node<T> {

    public Node<T> next;
    public Node<T> back;
    public T data;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}