public class Insersionsort {
   public static void inner(int arr[], int curr, int perv) {

    if (perv < 0 || arr[perv] <= curr) {
        arr[perv + 1] = curr;
        return;
    }

    arr[perv + 1] = arr[perv];
    inner(arr, curr, perv - 1);
}
    public static void outer(int arr[],int i){
        if(i>=arr.length) return;
        //work
        inner(arr,arr[i],i-1);

        outer(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
      
     
        //     int perv = i-1;
        //     while(perv >= 0 && arr[perv]>curr){
        //        arr[perv+1] = arr[perv];
        //        perv--;
        //     }
        //     arr[perv+1] = curr;
        // }

        outer(arr,1);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
