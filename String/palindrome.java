public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
    int i =0;
    int j = str.length()-1;

    while(i != j){
        if(str.charAt(i) == str.charAt(j)){
        i++;
        j--;
    }
    else{
        System.out.print("not palindrome");
        break;
    }
    }
    System.out.println("palindrome");
    }
}
