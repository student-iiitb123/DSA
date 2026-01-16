import java.util.ArrayList;

public class Permutation {
    public static void combination(int arr[],int start,ArrayList<Integer> list){
        if(start >arr.length){
          
            return;
        }
          System.out.println(list);
        for(int i = start;i<arr.length;i++){
           
                  list.add(arr[i]);
                  combination(arr, i+1, list);
                  list.remove(list.size()-1);
               

              


            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
       
        ArrayList<Integer> list = new ArrayList<>();
        combination(arr,0,list);
    }
    
}
