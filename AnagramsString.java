
import java.util.HashMap;

public class AnagramsString {
    public static void main(String[] args) {
      String s1 = "race";
        String s2 = "care";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                System.out.println("Not Anagrams");
                return;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        System.out.println("Anagrams");
    }
}
       

      
        //bothstring is anagrams if 
        // they contain same letters;
        // each letter appear the same no of times;
        // the order of letter can be different

