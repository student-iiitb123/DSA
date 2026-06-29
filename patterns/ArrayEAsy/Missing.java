

public class Missing {
   public static void main(String[] args) {
    int n =8;
    int sum =0;
    int sum2 =0;
    int arr[] ={8,2,4,5,3,7,1};
    for(int i=1;i<=n;i++){
        sum = sum +i;
   }
   int totalsum =sum;

   for(int i =0;i<arr.length;i++){
     sum2 = sum2 +arr[i];
  }
  

   

   System.out.println(totalsum - sum2);

}

    
}


