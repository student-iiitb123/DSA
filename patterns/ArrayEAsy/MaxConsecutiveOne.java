public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,1,1};
        int i =0;
        int j =0;
        int frequency=0;
        int max =0;

        
        //find first one;
        while(j<arr.length && i<arr.length){
            if(arr[j] == 1){
              frequency++;
              j++;
              max = Math.max(max,frequency);

            }else{
                frequency = 0;
                i++;
                j++;
            }
        }
        System.out.print(max);


    }
}
