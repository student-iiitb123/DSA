public class QuickSort {
    public static void quickSort(int arr[],int start,int end){
        int i = -1;
        int pivot  = arr[end];
        int k =0;
 while(k<=end){
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
    i++;
        int temp = arr[end];
        arr[end] = arr[k-1];
        arr[k-1] = temp;




        
    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
         for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
 }





        
    }
}
