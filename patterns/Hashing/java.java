public class java{
   public static void main(String[] args) {
           int[] arr = {1,2,1,3,2,1,5};
       // i want to declare hash function
       int hash[] = new int[6];
       for(int i=0;i<arr.length;i++){
          hash[arr[i]] += 1;
       }

       for(int i =0;i<6;i++){
         System.out.print(hash[i]);
       }

   }
}