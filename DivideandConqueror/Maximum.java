

public class Maximum {
    public static int merge(int arr[],int lo,int hi,int left,int right){
        int max = 0;
        if(left > right) {
            max = left;
            return max;
        }
        else{
            max = right;
            return max;
        }

       
    
    }
    public static int maximum(int arr[],int lo,int hi){
        if(lo == hi) return arr[lo];
        int mid = (lo + hi)/2;

        int leftmaximum = maximum(arr, lo, mid);
        int rightmaximum = maximum(arr, mid+1, hi);

        return merge(arr,lo,hi,leftmaximum,rightmaximum);


    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,9,1};
       int m = maximum(arr,0,arr.length-1);
       System.out.print(m);

        
    }
    
}
