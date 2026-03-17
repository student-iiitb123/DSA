import java.util.*;
public class nonrepeating {
    public static void main(String[] args) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        String s = "aabccxb";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            if(freq[ch-'a']>1){
             q.remove(ch);
              if(q.isEmpty()){
                    System.out.println("-1");
                }
                else{
                     System.out.println(q.peek());
                }
            
            }else{
                q.add(ch);
                  if(q.isEmpty()){
                    System.out.println("-1");
                }
                else{
                     System.out.println(q.peek());
                }
               

               
            }
         
        }
    }
}
