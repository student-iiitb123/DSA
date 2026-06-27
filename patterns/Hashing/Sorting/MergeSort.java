public class MergeSort {
    public static void Merge(int arr[],int si,int mid,int ei) {
        
    }
    public static void MergeSort(int arr[],int si,int ei) {
        if(si == ei) return;
        int mid = (si+ei)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si, mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,5,3};
        MergeSort(arr,0,arr.length-1);
    }
}
