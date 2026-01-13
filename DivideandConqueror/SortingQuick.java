

public class SortingQuick {

    public static void printarr(int arr[]) {
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static int partition(int arr[], int start,int end){
        int pivot = arr[end];
        int i = start-1;
        int k = start;
        while(k<end){
            if(arr[k] > pivot){
              k++;
            }
            else{
                i++;
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
           

        }
   
         
      
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void QuickSort(int arr[],int start,int end){
      if(start >= end) return ;
        int pivot = partition(arr, start, end);
        QuickSort(arr, start, pivot-1);
        QuickSort(arr, pivot+1, end);
    }



     
    public static void main(String[] args) {
     int arr[] ={6,3,9,8,2,5};
     QuickSort(arr,0,arr.length-1);
     printarr(arr);
   

    }

    //3,2,9,8,6,2,5
    
}
