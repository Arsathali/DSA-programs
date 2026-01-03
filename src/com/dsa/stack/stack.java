package com.dsa.stack;


class MyStack{
    int arr[];
    int capacity;
    int top;

    public MyStack(int capacity){
      this.arr = new int[capacity];
      this.capacity = capacity;
      this.top=-1;
    }

    public void push(int data){
        if(top == capacity-1){
            System.err.println("the Stack is full");
            return;
        }
        arr[++top] = data;
    }

    public int pop(){
        if(top==-1){
            System.err.println("the Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
         if(top==-1){
            System.err.println("the Stack is Empty");
            return -1;
        }
        return arr[top];
    }

}
