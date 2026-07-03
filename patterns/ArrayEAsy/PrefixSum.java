import java.util.HashMap;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {9,4,0,20,3,10,5};
        int k = 33;

        int count = 0;

        int ps[] = new int[arr.length];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            ps[i] = sum;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j = 0; j < arr.length; j++){

            if(ps[j] == k){
                count++;
            }

            int val = ps[j] - k;

            if(map.containsKey(val)){
                count += map.get(val);
            }

            map.put(ps[j], map.getOrDefault(ps[j],0)+1);
        }

        System.out.println(count);
    }
}