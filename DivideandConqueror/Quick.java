public class Quick{

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int partition(int arr[],int str,int end){
        int pivot = arr[end];
        int i = str-1;
        int j = end;
       int k = str;
while(k < end){

            if(arr[k] > pivot){
                k++;
            }
            else{
                i++;
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        i++;
                int temp = arr[k-1];
                arr[k-1] = arr[i];
                arr[i] = temp;

                return i;


    }
    public static void QuickSort(int arr[],int start,int end){
        if(start >= end) return;
           //pivot index
        int pivot= partition(arr,start,end);
        QuickSort(arr, start, pivot-1);
        QuickSort(arr, pivot+1, end);

    }
    public static void main(String[] args) {
      int arr[] ={6,3,9,8,2,5};
      QuickSort(arr,0,arr.length-1);
      printarr(arr);
    }
}