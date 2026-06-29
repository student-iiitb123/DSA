public class Rotatearray {
    public static void reverse(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k =2;
        int l = k;
 int m = arr.length-1;
      //step1 reverse arr;
       reverse(arr);

       for(int i =1;i<k;i++){
        int temp = arr[i-1];
        arr[i-1] = arr[i];
        arr[i] = temp;
 }

 

 while(l<m){
    int temp = arr[l];
    arr[l] = arr[m];
    arr[m] = temp;
    l++;
    m--;

 }
      


        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }
    
}
