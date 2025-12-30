public class maxpoint {
    public static void main(String[] args) {
        int h =4;
        int arr[] = {6,2,3,4,7,2,1,7,1};
      int l =0;
      int r = 0;
      int sum =0;

      while(r<h){
        sum = sum + arr[r];
        r++;
      }
   r--;
   sum = sum - arr[r];
   System.out.println(sum);
    
    }
}
