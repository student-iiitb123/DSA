public class StrinfCompression {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbcccdd");
        StringBuilder sb = new StringBuilder("a");
        int start =0;
        int end = str.length();
        int i =0;
       int count =0;
        while(start < end && i< end){
              
            if(str.charAt(start) == str.charAt(i)){
               
                i++;  //1 //2 //3
                count++;
            } else{
                sb.append(count);
                sb.append(str.charAt(i));
                count =0;
                start = i;

            }



            

           
        }
       ;
        sb.append(count);
        System.out.println(sb);
    }
}
