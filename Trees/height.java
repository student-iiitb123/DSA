import java.util.*;
public class height {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
         int n = sc.nextInt();
         int s = sc.nextInt();
         int x = sc.nextInt();
         int arr[] = new int[n];

         for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         int sum = 0;
         for(int i =0;i<n;i++){
            sum = sum + arr[i];
         }
         if(sum == s){
            System.out.println("yes");
         }
         else{
            while(sum < s){
                sum = sum + x;
                 }

    if(sum == s){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }

            
         }
         
        
        }
      
    }
    
}
