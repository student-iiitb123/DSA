public class In{
    public static void main(String[] args) {
        int arr[] = {7, 4, 1, 5, 3};
        //first we have storted and unsorted part
        for(int i =1;i<arr.length;i++){
            int curr = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
                }

                for(int i =0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }

        

    }
}
