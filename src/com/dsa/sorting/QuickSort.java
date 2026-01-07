public class QuickSort{

    public static void quickSort(int arr[],int low,int high){

        if(low >= high){
            return;
        }
        int partitonIndex = partioning(arr,low,high);
        quickSort(arr, low, partitonIndex-1);
        quickSort(arr, partitonIndex+1,high);
    }

    public static int partioning(int arr[],int low,int high){

        int i = low -1;
        int pivot = arr[high];
        for(int j = low; j<high; j++){
            
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap the pivot
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }
}