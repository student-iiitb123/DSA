public class Pea{
    public static int PeakElement(int arr[],int s,int e){
        if(s == e) return arr[e];

        int mid = (s+e)/2;

        
        // handle boundaries safely
        if (mid == 0) {
            return (arr[0] > arr[1]) ? arr[0] : arr[1];
        }
        if (mid == arr.length - 1) {
            return (arr[mid] > arr[mid - 1]) ? arr[mid] : arr[mid - 1];
        }

        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            return arr[mid];
        }
        else if(arr[mid] <arr[mid+1]){
            //peak must be right side
           return  PeakElement(arr, mid+1, e);
        }
        else{
            //peak must be left side 
           return PeakElement(arr, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
      int s =   PeakElement(arr,0,arr.length-1);
      System.out.println(s);


    }
}