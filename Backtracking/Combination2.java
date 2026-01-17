import java.util.*;

public class Combination2 {
    public static void CombinationSum(int arr[],int target,int start,int sum,ArrayList<Integer> a){
         if(start > arr.length){
            return ;
         }

        if(sum == target){
            System.out.println(a);
            return;
        }


        for(int i =start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i-1]) continue;
            a.add(arr[i]);
            CombinationSum(arr, target, i+1, sum+arr[i], a);
            a.remove(a.size()-1);
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target = 8;
        ArrayList<Integer> a = new ArrayList<>();
        CombinationSum(arr,target,0,0,a);
    }
}
