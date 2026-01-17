public class ValidParanthesis {

    public static void Paranthesis(int n,int open,int close,String s){

        if(s.length() == 2*n){
            System.out.println(s);
            return;

        }

        //open
        if(open<n){
        Paranthesis(n, open+1, close,s+"(");
        }
        //close
        if(close <open){
          Paranthesis(n, open, close+1,s+")");
        }
       
    }
    public static void main(String[] args) {
        int n = 3;
        String s  = "";
        Paranthesis(n,0,0,s);
    }
}
