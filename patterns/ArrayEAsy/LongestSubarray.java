public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        int i =0;
        int j = 0;
        int k = 15;
        int sum =0;
      
        int max =0;
        while(j<arr.length){

          sum = sum + arr[j];

          while(i<arr.length && sum > k){
            sum = sum - arr[i];
           
            i++;
         }

      
         max = Math.max(max, j-i+1);
          
         j++;

         
        }
        System.out.print(max);

       
          
    }
}
