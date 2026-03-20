public class BuyandSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int i =0;
        int j = i+1;
        int profit = 0;
        while(j < arr.length && i< arr.length){
            int pick = arr[i];
            if(arr[j] > pick){
                int amount = arr[i] - pick;
                profit = profit + amount;
                i++;
            }
            else{
                j++;

            }
          
            
           

        }
        System.out.print(profit);
    }
}
