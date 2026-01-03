package com.dsa.stack;
import com.dsa.list.MyLinkdedList;

class Stack<T> {

    MyLinkdedList<T> myLinkdedList = new MyLinkdedList<>();

    public void push(T data) {
       myLinkdedList.addfirst(data);
    }

    public T pop() {
        return myLinkdedList.removefirst();
    }

    public T peek() {
        return myLinkdedList.getFirst();
    }

    
    public boolean isEmpty() {
       return myLinkdedList.isEmpty();
    }

    public int size() {
        return myLinkdedList.size();
    }
}