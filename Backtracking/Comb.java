import java.util.ArrayList;

public class Comb {
    public static void comb(int arr[],int start,ArrayList<Integer> a,int target,int sum){
         

        if(sum > target){
           
            return;       
         }

           if(sum == target){
            System.out.println(a);
            return;
        }

        
         
     
      

        
         for(int i = start;i<arr.length;i++){
         
            a.add(arr[i]);
          comb(arr, i, a, target, sum + arr[i]); 
            a.remove(a.size()-1);
         
          

         }
    
  
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        //Declaring 
        int target = 4;
        ArrayList<Integer> a = new ArrayList<>();
      comb(arr,0,a,target,0);

    }

}
