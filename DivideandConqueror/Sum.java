

public class Sum {
    public static int merge(int arr[],int lo,int hi,int left,int right){
        int sum = 0;
        sum =left + right;

        return sum;

    }
    public static int sum(int arr[],int lo,int hi){
        if(lo == hi) return arr[lo];
        int mid = (lo+hi)/2;
        int left = sum(arr, lo, mid);
        int right = sum(arr, mid+1, hi);

        return merge(arr,lo,hi,left,right);


    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
      int s =  sum(arr,0,arr.length-1);
      System.out.println(s);

        
    }
    
}
