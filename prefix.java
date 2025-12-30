public class prefix {
    public static void main(String args[]){
        int arr[] = {3,4,8,-9,20,6};
         int sum =0;
         for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
         }
        int leftsum =0;
        int rightsum ;

        for(int i=0;i<arr.length;i++){
            rightsum = sum- leftsum-arr[i];
            // leftsum = leftsum + arr[i];
            if(rightsum == leftsum){
                System.out.println(i);
            }
            
             leftsum = leftsum + arr[i];
        
        }


    }
    
}
