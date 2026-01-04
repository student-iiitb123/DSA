

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
       
  

    int k =0;
   

    while(str.charAt(k) != ' '){
       k++;
    }
    int start  =0;
    int end = k-1;
  
    while(start<end){
         char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
    }

    int second_start = k+1;
    int second_end = str.length()-1;

    

     while(second_start<second_end){
         char temp = str.charAt(second_start);
            str.setCharAt(second_start, str.charAt(second_end));
            str.setCharAt(second_end, temp);
            second_start++;
            second_end--;
    }




    for(int m =0;m<str.length();m++){
        System.out.print(str.charAt(m));
    }

   
        
    }
   

    
}
