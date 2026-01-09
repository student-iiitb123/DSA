public class Binary {
    public static void BinaryString(int n,int lp,String s){
 if(n == 0){
    System.out.println(s);
    return;
 }
if(lp == 0){
    BinaryString(n-1,0,s+"0");
    BinaryString(n-1,1, s+"1");
}else{
      BinaryString(n-1,0,s+"0");
}


    }
 public static void main(String[] args){
    int l= 2;
    int lastplace = 0;
    String str = "";
    BinaryString(l,lastplace,str);

 }

    
}
