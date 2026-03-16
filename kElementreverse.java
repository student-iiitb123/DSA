public class kElementreverse {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int i =0;
        int j = arr.length-1;
        int k =4;
      while(i < j ){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        i++;
        j--;
        }

        int l =0;
        int m = arr.length-k;
        while(l<= k-1 && m <= arr.length-1){
            int temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m++;
        }
 int d = k;
       int f = arr.length -1;

       while(d<f){
        int temp = arr[d];
        arr[d] = arr[f];
        arr[f] = temp;
        f--;
        l++;
       }

      
        for(int b =0;b<arr.length;b++){
            System.out.println(arr[b]);
        }
       

    }
}
