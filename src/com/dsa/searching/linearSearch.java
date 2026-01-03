package com.dsa.searching;

public class LinearSearch {
    
    public static void main(String[] args) {
        
        int arr[] = {5,8,10,15,20};
        int key = 8;

        boolean isTrue = searchLinear(arr,key);
        System.out.println(isTrue);
    }

    public static boolean searchLinear(int arr[],int key) {
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
