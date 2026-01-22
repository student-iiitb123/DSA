public class Phone {
    public static void print(String s,int i ,String s1){
       
  if(i >= s.length()){
      System.out.println(s1);
    return;
  }
 
  
  print(s, i+1, s1+s.charAt(i));
  print(s, i+1, s1);
    }
    public static void main(String[] args) {
        String str = "123";
        String str1="";
        print(str,0,str1);
    }
}
