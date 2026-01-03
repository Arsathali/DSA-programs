package com.dsa.queue;


class Queue {
    int arr[];
    int size;
    int capacity;
    int front;
    int rear;

    public Queue(int capacity){
       this.capacity = capacity;
       this.arr = new int[capacity];
       this.rear = -1;
       this.front =0;
       this.size =0;
    }

    public void enQueue(int data){

        if(size == capacity){
            System.out.println("Queue is Full");
        }else{
            rear = (rear+1) % capacity;
            arr[rear] = data;
            size++;
        }
    }
    public int deQueue(){

        if(size == 0){
            System.out.println("The queue is Empty");
            return -1;
        }else{
            int data = arr[front];
            front = (front + 1)% capacity;
            size--;
            return data;
        }
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }


}
 public class QueueUsingArray{

    public static void main(String args[]){
        
        Queue queue = new Queue(4);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println(queue.deQueue());
        
        System.out.println(queue.deQueue());
        
        System.out.println(queue.deQueue());
        
        System.out.println(queue.deQueue());
        
        System.out.println(queue.deQueue());

      
    }
}