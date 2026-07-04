//two sum

public class twosum {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;
         int sum =0;
        int i =0;
        int j =0;

        while(j<arr.length){
            sum = sum + arr[j];
            while(i<arr.length && sum > target){
                sum = sum - arr[i];
                i++;
            }

            if(sum == target){
                System.out.println(i + " " + j);
            }

            j++;

           
        }
       
    }
}

