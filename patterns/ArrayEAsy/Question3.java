

public class Question3 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int brr[] = new int[arr.length];
        brr[0] = arr[0];
        for(int i =1;i<arr.length;i++){
             if(arr[i] == arr[i-1]){
                continue;
             }else{
                brr[i] = arr[i];
               
             }
            
        }
         for(int i=0;i<brr.length;i++){
                System.out.print(brr[i]);
             }
    }
}
