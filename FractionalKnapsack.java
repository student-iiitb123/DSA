import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]= {10,20,30};
        int value[] = {60,100,120};
      int W = 50;
      double arr[][] = new double[weight.length][2];
      for(int i =0;i<weight.length;i++){
        arr[i][0] = 1;
        arr[i][1] = value[i]/(double)weight[i];
      }
      Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));
      int maxCapacity = W;
      double sum =0;

      for(int i =arr.length-1;i>=0;i--){
        int idx =(int)arr[i][0];
        if(weight[idx] <= maxCapacity){
            sum = sum + value[idx];
            maxCapacity = maxCapacity-weight[idx];
           
        }
        else{
            double remain = arr[i][1] * maxCapacity;
            sum = sum + remain;
           break;
        }
      }

      System.out.println(sum);






    }
}
