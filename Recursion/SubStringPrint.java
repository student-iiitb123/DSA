public class SubStringPrint {
    public static void SubStringPrintall(String str,String str2,int i) {
        
        if(i>str.length()-1){
            System.out.println(str2);
            return;
        }
      
      

       SubStringPrintall(str, str2+str.charAt(i), i+1);
       SubStringPrintall(str, str2, i+1);
        

    }
    public static void main(String[] args) {
        String Str ="abcab";
        String SubString = "";

        SubStringPrintall(Str,SubString,0);
        
        
        
    }
}
