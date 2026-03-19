public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]= {10,20,30};
        int value[] = {60,100,120};
        int maxCapacity = 50;
        int sum = 0;


        for(int i =0;i<weight.length;i++){
            int remainingweight = maxCapacity - weight[i];
            if(remainingweight >= weight[i]){
               sum = sum + value[i];
            }
            else{
                int fractional = (value[i]/weight[i]) *remainingweight;
                sum = sum + fractional;
            }


        }
        System.out.println(sum);
    }
}
