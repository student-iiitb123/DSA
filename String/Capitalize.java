public class Capitalize {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("hi i am ashish");
       StringBuilder sb = new StringBuilder("");
       boolean Capitalized = true;
    
       for(int i =0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == ' '){
            Capitalized = true;
            sb.append(ch);
        }
        else if(Capitalized){
                 sb.append(Character.toUpperCase(ch));
                 Capitalized = false;
}

 else {
                sb.append(ch);
            }
       }
         System.out.println(sb);

       
    }
}
