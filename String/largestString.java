

public class largestString {
    public static void main(String[] args) {
         String fruit[] = {"apple","mango","banana"};
          
          int maxcount =0;
         for(int i=0;i<fruit.length;i++){
            int count =0;
            for(int j =0;j<fruit[i].length();j++){
                count++;
               
            }
         maxcount = Math.max(count, maxcount);
         }
  System.out.println(maxcount);
    }
    
}
