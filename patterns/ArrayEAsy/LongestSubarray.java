public class LongestSubarray {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        int i =0;
        int j = 0;
        int k = 15;
        int sum =0;
        int count =0;
        int max =0;
        while(j<arr.length && i<arr.length){
          sum = sum + arr[j];

          if(sum <= k){
            count = count +1;
            j++;
            max = Math.max(max, count);
            
          }
          else{

            sum = sum -arr[i];
            count = count - 1;
            i++;
            j++;
            
          }
        }
        System.out.print(max);

       
          
    }
}
