public class NegativeNumber {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,-6};
        int i =0;
        while(i<arr.length) {
            if(arr[i] > 0){
                i++;
            }
        }
        int j =i+1;
        while(j<arr.length){
            if(arr[j] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
            
        }
        for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
