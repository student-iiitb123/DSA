

public class PeakElement {
    public static int merge(int arr[],int lo,int mid,int hi,int left,int right){
        int peak =0;
     if(left < right){
        peak= right;
     }
     return peak;
    }
    public  static int Peak(int arr[],int lo,int hi){
        if(lo == hi) return arr[lo];
        int mid = (lo+hi)/2;

        int left = Peak(arr, lo, mid);
        int right = Peak(arr, mid+1, hi);

        return merge(arr,lo,mid,hi,left,right);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 3, 5, 6, 2};
      int p =  Peak(arr,0,arr.length-1);
      System.out.print(p);



        
    }
    
}
