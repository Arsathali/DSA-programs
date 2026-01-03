package com.dsa.sorting;

public class BubbleSort {
    
    public static int[] bubbleSort(int arr[]){

        int n = arr.length;

        for(int i=n-1; i>0; i--){

            boolean swapped = false;
            for(int j=0; j<i; j++){

                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }

        }

        return arr;
    }

 }




