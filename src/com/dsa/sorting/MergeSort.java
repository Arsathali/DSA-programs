
import java.util.ArrayList;

public class MergeSort {
    

    public static void mergeSort(int arr[],int low,int high) {
         
        if(low==high) return;

        int mid = low + (high-low)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }

    public static void merge(int arr[],int low,int mid,int high) {
     
        ArrayList<Integer> list = new ArrayList<>();

        int left = low; int right = mid+1;

        while(left<=mid && right <= high){

            if(arr[left] <= arr[right]){
                list.add(arr[left++]);
            }else{
                list.add(arr[right++]);
            }
        }

        while(left<=mid){

            list.add(arr[left++]);
        }

        while(right<=high){

            list.add(arr[right++]);
        }

        for(int i=low;i<=high; i++){
            arr[i] = list.get(i-low);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}


