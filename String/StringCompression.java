public class StringCompression{
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        int i =0;
        int j=0;
        int count =0;
        while(i<str.length() && j<str.length()){
          if(str.charAt(i) == str.charAt(j)){
            count++;
            j++;
          }
          else {
    System.out.print(str.charAt(i) + "" + count);
    count = 0;
    i = j;
}
        }
        System.out.print(str.charAt(i) + "" + count);
        
    }
}