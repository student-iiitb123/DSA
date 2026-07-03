import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {9,-3,3,-1,6,-5};
        int k = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int prefixSum = 0;

        // Prefix sum 0 exists before the array starts at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for(int j = 0; j < arr.length; j++) {

            prefixSum += arr[j];

            int val = prefixSum - k;

            // If required prefix sum exists
            if(map.containsKey(val)) {

                ArrayList<Integer> list = map.get(val);

                // Print every subarray
                for(int startIndex : list) {

                    System.out.print("Subarray : ");

                    for(int i = startIndex + 1; i <= j; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                }
            }

            // Store current index
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(j);
        }
    }
}