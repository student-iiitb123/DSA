public class variable {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,1,1,5};
        int x = 8;
        int left = 0;
        int sum =0;
        int maxlength =0;

        for(int right =0;right <arr.length;right++){
            sum = sum + arr[right];

            while(sum <= x){
                maxlength = Math.max(maxlength, right-left+1);
                sum = sum - arr[left];
                left--;

            }

        }
        System.out.println(maxlength);
    }
}