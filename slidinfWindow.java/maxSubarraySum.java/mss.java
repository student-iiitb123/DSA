public class mss {
    public static void main(String[] args) {
        int arr[] = {2,5,1,7,10};
       int r =0;
       int l =0;
       int count =0;
       int sum =0;
       int max=0;
       int k =14;
       while(r<arr.length && l<arr.length){
        sum = sum + arr[r];
        if(sum < k){
            r++;
            count++;
        }
        else{
         sum = sum- arr[l];
         count--;
         l++;
        }
        max = Math.max(count,max);
       }
       System.out.println(max);
    }
}
