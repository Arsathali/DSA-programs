package com.dsa.queue;
import com.dsa.list.MyLinkdedList;

public class QueueLL<T>{

    MyLinkdedList<T> myLinkdedList = new MyLinkdedList<>();

    public void enQueue(T element){
        myLinkdedList.addlast(element);
    }

    public T deQueue(){
        return myLinkdedList.removefirst();
    }

    public T getFront(){
       return myLinkdedList.getFirst();
    }

    public T getRear(){
       return myLinkdedList.getlast();
    }

     public boolean isEmpty() {
       return myLinkdedList.isEmpty();
    }

    public int size() {
        return myLinkdedList.size();
    }

}

