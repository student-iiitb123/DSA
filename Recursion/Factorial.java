

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1) {
           return 1;
        }
        int s= fact(n-1) * n;
        return s;

    }
    public static void main(String[] args) {
      int s=  fact(5);
      System.out.println(s);
       
    }
    
}
