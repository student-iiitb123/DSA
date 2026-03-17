import java.util.*;
public class nonrepeating {
    public static void main(String[] args) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        String s = "aabccxb";
   for(int i =0;i<s.length();i++){
    //Traverse character
       char ch = s.charAt(i);
       q.add(ch);
       freq[ch-'a']++;

       while (!q.isEmpty() && freq[q.peek() -'a'] >1) { 
           q.remove();
       }
      if(q.isEmpty()){
        System.out.println("-1");
      }
      else{
        System.out.println(q.peek());
      }


   }
      
    }
}
