
public class maxsumtakeK {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,3,4,5,-1};
        int k =4;
        int sum =0;
   for(int i=0 ; i<k;i++){
           sum = sum + arr[i];
   }

   int maxsum = sum;
   int l =0;
   int r =k-1;
   while(r < arr.length-1){
    sum = sum - arr[l];
    l++;
    r++;
    sum = sum + arr[r];
    maxsum = Math.max(maxsum,sum);

   }
   System.out.print(maxsum);
    }
}
