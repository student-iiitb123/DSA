

public class optimizedpower {
    public static int count(int n){
        
                   if (n == 0) return 1;  
                   if (n == 1) return 1;  

        return count(n - 1) + count(n - 2);

        }
    public static void main(String[] args) {

        int n=4;
        int ways = count(n);
        System.out.println(ways);

         }
}
