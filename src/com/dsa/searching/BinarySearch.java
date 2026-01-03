package com.dsa.searching;

import java.util.Arrays;

public class BinarySearch {
    
    public static boolean binarySearch(int arr[],int key){

        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            int mid = (low+high)/2;

            if(arr[mid]==key){
                return true;
            }
            else if(key < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,3,4,5,6};
        int key = 6;
        Arrays.sort(arr);
        boolean isTrue = binarySearch(arr,key);
    }
}
