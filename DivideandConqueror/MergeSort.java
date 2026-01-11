

public class MergeSort {
    public static void Merge(int arr[],int start,int end){
      if(start == end){
        return;
      }
        int mid = (start+end)/2;
        Merge(arr, start, mid);
        Merge(arr,mid+1,end);

    }
    public static void main(String args[]){
        int arr[]= {70,30,50,10};
        Merge(arr,0,arr.length-1);
    }
}
