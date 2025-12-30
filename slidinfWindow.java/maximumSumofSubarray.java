import java.util.*;

public class maximumSumofSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
       //find thee maximum sum of any subarray of size 3;
       // we need continous element 
       // window size must be exactly 3;

       int left =0;
       int right =0;
       int sum =0;
       int maxSum = 0;

       for(int i=0;i<k;i++){
        sum = sum + arr[i];
        right++;
        maxSum = Math.max(maxSum,sum);
       }


       
       while(right < arr.length ){
        sum = sum - arr[left];
        left++;
      
        sum =  sum + arr[right];
          right++;
          maxSum = Math.max(maxSum,sum);
       }

     System.out.println(maxSum);
   

      
      










    }
}
