public class Sorted{
   static    boolean flag = true;
    public static void sort(int arr[],int i){
      
        if(i>=arr.length-1) return;

        if(arr[i] >arr[i+1]){
            flag = false;
         
            return;
        }

        sort(arr, i+1);

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        sort(arr,0);
        
        if(flag){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
       
    }
}