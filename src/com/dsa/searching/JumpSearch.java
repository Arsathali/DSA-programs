package com.dsa.searching;

import java.util.Arrays;

public class JumpSearch {
    
    
    public boolean jumpSearch(int arr[],int target){

        Arrays.sort(arr);
        int n = arr.length;

        int jump = (int) Math.sqrt(n);
        int temp = jump;

        int prev = 0;

        while(arr[Math.min(jump,n)-1] < target){
            prev = jump;
            jump += temp;

            if(prev>=n){
                return false;
            }
        }
        int end = Math.min(jump, n);
        for (int i = prev; i < end; i++) {
            if (arr[i] == target) {
                return false;
            }
        }
        return false;
        

    }
}
