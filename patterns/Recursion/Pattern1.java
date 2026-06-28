public class Pattern1 {
    public static void inner(int i,int j){
        if(j>2) return;

        System.out.print("*");
        inner(i,j+1);
    }

    public static void outer(int i){
       if(i>3) return;
    
       inner(i,1);
       System.out.println();
       outer(i+1);
    }
    public static void main(String[] args) {
        outer(1);
    }
    
}
