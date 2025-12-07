

public class longestSubstring {
    public static void main(String[] args) {
        int k = 14;
        int arr[] = {2,5,1,10,10};
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxstring = 0;
        while (r < arr.length){
        sum = sum + arr[r];
        while(sum > k){
            sum = sum - arr[l];
            l++;
        }
        if(sum <= k){
          maxstring = Math.max(maxstring,r - l + 1);
          r++;
        }
        }
        System.out.println(maxstring);
    }
}
