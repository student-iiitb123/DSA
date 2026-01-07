public class SubString {
    public  static  StringBuilder Substring(StringBuilder str,int i,StringBuilder s){
         System.out.println(s);
        if(i >=  str.length()) return s;
   
       
       StringBuilder newS = new StringBuilder(s);
        newS.append(str.charAt(i));

  

        return Substring(str, i + 1, newS);
    }
    public static void main(String[] args) {
       

        
        StringBuilder str = new StringBuilder("abcab");
        StringBuilder s = new StringBuilder(" ");
        Substring(str,0,s);
        
    }
}
