
public class question3 {
     
    public static void main(String[] args) {
       int n = 45554;
         int reverse =0;
        int lastNumber;
        while(n>0){
            lastNumber = n%10;
            reverse = reverse*10 + lastNumber;
            n= n/10;
 }
 System.out.println(reverse);
  if(reverse == n){
    System.out.println("palindrome");
 }
 else{
    System.out.println("Not palindrome");
 }
        



        

    }
    
    
}
