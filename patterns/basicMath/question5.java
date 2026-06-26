public class question5 {
    public static void main(String[] args) {
        int n =123;
        int count =0;
        int original = 123;
        int check = 123; 
        int sum =0;
        int last =0;
        while(n>0){
         n = n/10;
         count++;
        }

        while(original>0){
           last = original%10;
           sum = sum + (int) Math.pow(last, count);
           original = original/10;
        }

        if(check == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not ArmStrong");
        }


    }
}
