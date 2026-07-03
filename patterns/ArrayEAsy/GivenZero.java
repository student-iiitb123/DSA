import java.util.HashMap;

public class GivenZero {
    public static void main(String[] args) {
        int arr[] = {9,-3,-3,-1,6,-5};
       HashMap<Integer,Integer> map = new HashMap<>();

     int sum =0;
     int max = 0;

     for(int i =0;i<arr.length;i++){
        sum = sum + arr[i];

        if(sum == 0){
            max = i+1;
        }
       
       if(map.containsKey(sum)){
            max = Math.max(max, i-map.get(sum));
        }else{
            map.put(sum, i);
        }
     }



       

         


    }
}
