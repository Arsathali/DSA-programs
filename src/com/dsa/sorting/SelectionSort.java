package com.dsa.sorting;

public class SelectionSort {
    
    public static int[] selectionSort(int arr[]){

        for(int i=0; i<arr.length; i++){

            int minimum = i;

            for(int j=i; j<arr.length; j++){

                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;

        }

        return arr;
    }
}

