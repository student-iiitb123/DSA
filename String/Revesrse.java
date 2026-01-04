

public class Revesrse {
    public static void main(String[] args) {
      StringBuilder str = new StringBuilder("the sky");
         int i =0;
         int j = str.length()-1;
         while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
            
         }
       
       int k=0;
       int l= 2;
        while(k<l){
            char temp = str.charAt(k);
            str.setCharAt(k, str.charAt(l));
            str.setCharAt(l, temp);
            k++;
            l--;
        }

        int c = 4;
        int d = str.length() -1;
        while(c<d){
             char temp = str.charAt(c);
            str.setCharAt(c, str.charAt(d));
            str.setCharAt(d, temp);
            c++;
            d--;

        }
         for (int m = 0; m < str.length(); m++) {
            System.out.print(str.charAt(m));
        }

        
    }
   

    
}
