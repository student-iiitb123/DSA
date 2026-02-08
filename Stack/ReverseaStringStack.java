import java.util.*;

public class ReverseaStringStack {

    public static void main(String[] args) {
        String str = "abc";
        String s1 = "";
        Stack<Character> s = new Stack<>();
        for(int i =0;i< str.length();i++){
            s.add(str.charAt(i));
        }

        while(!s.isEmpty()){
        
            s1 = s1+s.pop();
            
        }

        System.out.println(s1);
    }
}
