
import java.util.*;

public class ArraySubset {
    public static void Subset(int arr[],int start,ArrayList<Integer> list){
        if(start == arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[start]);
        Subset(arr, start+1, list);
        list.remove(list.size() - 1);
        Subset(arr, start+1, list);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> a = new ArrayList<>();
         Subset(arr,0,a);
    }
    
}
