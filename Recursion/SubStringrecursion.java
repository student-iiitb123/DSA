public class SubStringrecursion {
    public static void SubString(String sb,int i,String sc){
         System.out.println(sc);
        if(i >= sb.length()) return ;

    
     SubString(sb, i+1, sc+sb.charAt(i));
       SubString(sb, i + 1, sc);
    
    }
    public static void main(String[] args) {
        String str = "abc";
        String s = " "; //empty String
        SubString(str,0,s);
    }
}
