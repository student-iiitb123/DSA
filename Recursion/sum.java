

public class sum {
    public static  int sum(int n,int summ){
        if(n==0){
            return summ+n;
        }
    int s =    sum(n-1,summ+n);
    return s;

    }
    public static void main(String[] args) {
     int s =   sum(10,0);
     System.out.println(s);
    }
}
 