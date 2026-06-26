

public class question2 {
    public static void main(String[] args) {
        int n = 12345;
        int reverse =0;
        int lastNumber;
        while(n>0){
            lastNumber = n%10;
            reverse = reverse*10 + lastNumber;
            n= n/10;



           
            
        }

        System.out.println(reverse);

    }
}
