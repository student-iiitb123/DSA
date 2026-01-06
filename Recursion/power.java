

public class power {
    public static int pow(int x,int p){
       if(p == 0) return 1;
     return  2* pow(x, p-1);

    
         

       }
    public static void main(String[] args) {
      int p =  pow(2,3);
      System.out.println(p);
    }
    
}
