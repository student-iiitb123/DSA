public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        int k = 15;
        int i =0;
        int j =0;
        int sum =0;
        int count =0;
        int maxCount = 0;
        while (i<arr.length && j<arr.length) { 
            
            if(sum == k){
                maxCount = Math.max(count, maxCount);
          }
          else if(sum<k){
            sum = sum + arr[j];
            count++;
            j++;
          }
          else{
            count =0;
            i++;
            j++;
          }
          
        }
        System.out.print(maxCount);
    }
}
