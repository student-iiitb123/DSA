public class Me {
   public static void Merge(int arr[], int si, int mid, int ei) {

    int n = ei - si + 1;
    int temp[] = new int[n];

    int left = si;
    int right = mid + 1;
    int k = 0;

    while (left <= mid && right <= ei) {

        if (arr[left] <= arr[right]) {
            temp[k++] = arr[left++];
        } else {
            temp[k++] = arr[right++];
        }
    }

    while (left <= mid) {
        temp[k++] = arr[left++];
    }

    while (right <= ei) {
        temp[k++] = arr[right++];
    }

    for (int i = 0; i < temp.length; i++) {
        arr[si + i] = temp[i];
    }
}
      
    
    public static void MergeSort(int arr[],int si,int ei) {
        if(si == ei) return;
        int mid = (si+ei)/2;
        MergeSort(arr, si, mid);
          MergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,5,3};
        MergeSort(arr,0,arr.length-1);

          for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
