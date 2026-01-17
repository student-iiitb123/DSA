import java.util.ArrayList;

public class BruteForce {

    public static void combination(String n, String arr[], ArrayList<String> result, int index, StringBuilder current) {

       // Base case: if we've processed all digits
        if (index == n.length()) {
            result.add(current.toString());
            return;

        }



        int number = n.charAt(index) - '0';
        String letters = arr[number];  



        for (int j = 0; j < letters.length(); j++) {
                                                   
            // Add letter to current combination
            current.append(letters.charAt(j));
            // Recurse for next digit
            combination(n, arr, result, index + 1, current); 
            // Backtrack: remove last letter to try next option
            current.deleteCharAt(current.length() -1);
        }

    }

         public static void main(String[] args) {
         String n = "234";
         String arr[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
         ArrayList<String> result = new ArrayList<>();
         combination(n, arr, result, 0, new StringBuilder());
         System.out.println(result);

        







    }
}


