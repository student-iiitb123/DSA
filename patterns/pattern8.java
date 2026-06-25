public class pattern8 {
    public static void main(String[] args)
     {
         int n = 5;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int k =0;k<2*i+1;k++){
                System.out.print("*");
            }

            for(int l =0;l<n-i;l++){
                System.out.print(" ");
            }

            System.out.println();
            

        }
       
      
        
        for(int i=4;i>=0;i--){
        
            for(int j =0;j<4-i;j++){
                System.out.print(" ");
            }

         for(int k=0;k<2*i+1;k++){
            System.out.print("*");
         }
         System.out.println();
          
        }
    }
    
}
