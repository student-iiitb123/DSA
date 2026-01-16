

public class Subset {

    public static void Subset(String s,String sb,int start ,int end){
        if(start >end){
            System.out.println(sb);
            return;
        }

        Subset(s, sb+s.charAt(start), start+1, end);
        Subset(s, sb, start+1, end);

          
    }
    public static void main(String args[]){
       String s = "abc";
       String sb = "";
       Subset(s,sb,0,s.length()-1);
    }
    
}
