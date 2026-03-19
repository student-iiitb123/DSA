import java.util.*;

public class nRopes {
    public static void main(String[] args) {
        int k =2;
        Queue<Integer> q = new LinkedList<>();
        int arr[] = {4,3,2,6};
        int sum =0;
        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){

             if(q.size() >k){
                q.remove();
                sum = sum - q.peek();
            }
            q.add(arr[i]);
            sum = sum + arr[i];

           
        }
        System.out.println(sum);

    }
}
