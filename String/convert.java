public class convert{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi i am ashish");
        //convert to uppercase of string first letter'
        int start =1;
        StringBuilder sb = new StringBuilder("H");
        while(start <str.length()){
            if(str.charAt(start) == ' '){
                sb.append(str.charAt(start));
                sb.append(Character.toUpperCase(str.charAt(start+1)));
                start++;
            }
            else{
                sb.append(str.charAt(start));
            }
            start++;
        }
         System.out.println(sb);

    }
}








