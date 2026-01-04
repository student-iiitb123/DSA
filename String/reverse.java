public class reverse {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("the sky is blue");
        int i =0;
         int j = str.length()-1;
         while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
            
         }
          int start =0;
          int end = str.length()-1;
          int s =0;
         while(start < end){
           if(str.charAt(s) != ' '){
            s++;
           }else{
            int z =0;
            s =z; 
            while(start< z){          
                  char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(z-1));
            str.setCharAt(z-1, temp);
            start++;
            z--;
           
            }
             start =s+1;
            s =s+1;
           }

             for(int m =0;m<str.length();m++){
        System.out.print(str.charAt(m)); 
    }
                
            
         }
    }
    
}



