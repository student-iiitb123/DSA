public class SubStringPrint {
    public static void SubStringPrintall(String str,String str2) {
        if(str.length()==str2.length()){
            System.out.println(str2);
            return;
        }
        
  for(int i =0;i<str.length();i++){
    SubStringPrintall(str, str2+str.charAt(i));
   
  }
        

    }
    public static void main(String[] args) {
        String Str ="abcab";
        String SubString = "";

        SubStringPrintall(Str,SubString);
        //print all substring
        
        
    }
}
