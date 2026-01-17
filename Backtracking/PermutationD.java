import java.util.ArrayList;

public class PermutationD {
    public static void combination(int arr[],int start,boolean a[],ArrayList<Integer> list){
        if(start== arr.length){
            System.out.println(list);
            return;
        }
        for(int i = 0;i<arr.length;i++){
         if(i > 0 && arr[i] == arr[i-1] && !a[i-1]) continue;

            if(!a[i]){
                  a[i] = true;
                  list.add(arr[i]);
                  combination(arr, start+1, a, list);
                  list.remove(list.size()-1);
                  a[i] = false;

            


            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        boolean a[] =  new boolean[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        combination(arr,0 ,a,list);
    }
    
}

