import java.util.ArrayList;

public class Comb {
    public static void comb(int arr[],int start,ArrayList<Integer> a){
         

        if(start > arr.length){
            return;       
         }
         System.out.println(a);
        
         for(int i = start;i<arr.length;i++){
            a.add(arr[i]);
            comb(arr,i+1, a);
            a.remove(a.size()-1);

         }
    
  
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        //Declaring 
        ArrayList<Integer> a = new ArrayList<>();
      comb(arr,0,a);

    }

}
