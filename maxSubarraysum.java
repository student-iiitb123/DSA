public class maxSubarraysum {
    public static void main(String[] args) {
        int arr[] = {1,-2 ,6,-1,3};
        int maxSum = 0;
        
        //brute force 
        // print all the subarray
        for(int i=0;i<arr.length;i++){
           for(int j =0;j<arr.length;j++){
           int sum =0;
            for(int k =i;k<=j;k++){
                sum = sum + arr[k];
                System.out.print( arr[k] );
             
             
            }
            System.out.print("=");
            System.out.print(sum);
              maxSum = Math.max(maxSum, sum);
                   System.out.println();
           }
        }
        System.out.println(maxSum);

    }
}
