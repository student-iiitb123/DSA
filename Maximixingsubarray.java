import java.util.ArrayList;

public class Maximixingsubarray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        ArrayList<Integer> a1 = new ArrayList<>();
         ArrayList<Integer> a2 = new ArrayList<>();
         int mid = arr.length/2;
         int i =0;int j =mid;
         int sum1 = 0;
         int sum2 = 0;
         while(i<mid){
            a1.add(arr[i]);
            sum1 = sum1 +arr[i];
            i++;
         }
         
         while(j<arr.length){
            a2.add(arr[j]);
            sum2 = sum2 +arr[j];
            j++;
         }

         System.out.println(a1);
              System.out.println(a2);

              
    }
}
