

public class question1 {
    public static void main(String[] args) {
        int count = 0;
        int  n = 12345;
        while(n>0){
            n = n/10;
            count++;
        }

        System.out.print(count);
    }
    
}
