public class question4 {
  public static void main(String[] args) {
        int n = 20;
        int m = 15;
        int max =0;
        for(int i =1;i<=20;i++){
            if(n%i ==0 && m%i ==0){
            max = Math.max(i, max);
            }
        }
        System.out.print(max);
    }
}
