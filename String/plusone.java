

public class plusone {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int brr[] = new int[arr.length];
      
         int number =0;
         int powers = arr.length-1;
        for(int k =0;k<arr.length;k++){
number += arr[k] * (int)Math.pow(10, powers); 
    powers--; 
          
        }
       int new_number = number+1;
       int n = 100;
       int f = arr.length-1;
       for(int i =0;i<brr.length;i++){
        brr[f-i] =new_number%n;
        System.out.print(brr[i]);
       new_number = new_number/10;
       
            n = n/10;
     
    
       }
       
     
    }
}
