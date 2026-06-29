import java.util.HashSet;



public class UseSet {
    public static void main(String[] args) {
        int arr[] = {5,2,4,2,1,5};
       
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    
}
