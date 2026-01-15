

public class InversionMerge {
       static int inversionCount = 0;
      public static void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1]; // temp array to store merged elements
        int i = start;       // pointer for left half
        int j = mid + 1;     // pointer for right half
        int k = 0;           // pointer for temp array

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                // No inversion, copy left element
                temp[k++] = arr[i++];
            } else {
                inversionCount += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

   
        while (j <= end) {
            temp[k++] = arr[j++];
        }

    
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
    }
    public static void Inversion(int arr[],int start,int end){
        if(start >= end) return;
        int mid = (start+end)/2;

        Inversion(arr, start, mid);
        Inversion(arr, mid+1, end);
        //merge
        merge(arr,start,mid,end);

    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,3};
        Inversion(arr,0,arr.length-1);
        
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nInversion Count = " + inversionCount);
    }
    
}
