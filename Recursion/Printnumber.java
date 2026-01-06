

public class Printnumber {
    public static void Decresing(int n){
        if(n<0) return;
           System.out.print(n);
        Decresing(n-1);
     
    }
 public static void main(String[] args) {
    Decresing(5);
 }
}
