public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {9,4,20,3,10,5};
        int k =33;
        int ps[] = new int[arr.length];
        int sum = 0;
        for(int i =0;i<arr.length;i++){
          sum = sum +arr[i];
          ps[i] =sum;
        }
        for(int i =0;i<ps.length;i++){
         System.out.println(ps[i]);
        }
    }

}
