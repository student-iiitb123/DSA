import java.util.ArrayList;

public class Partitiontion {
    public static boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

      public static void partition(String s, int start, ArrayList<String> list){
   if(start == s.length()){
     System.out.println(list);
            return;
   }
 for(int i = start; i < s.length(); i++){

            if(isPalindrome(s, start, i)){
                list.add(s.substring(start, i+1));
                partition(s, i+1, list);
                list.remove(list.size()-1); 
            }
        }

       
      
    }
       public static void main(String[] args){
        String s = "aab";
        partition(s, 0, new ArrayList<>());
    }
}
