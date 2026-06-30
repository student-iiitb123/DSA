public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0,1};
        //find first zero;
        int i =0;
        while(i<arr.length && arr[i] != 0){
            i++;
        }
        int j = i+1;
        while(j<arr.length ){
            if(arr[j] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            }
             j++;

        }
         for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]);
         }
       
     
    }
    

    
}
