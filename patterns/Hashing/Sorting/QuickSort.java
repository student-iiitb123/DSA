public class QuickSort{
    public static void Quick(int arr[],int low,int high){
      int i = low;
      int j =high;
      int pivot = arr[low];
      while(i<j){
        while(arr[i]<= pivot&& i<=high){
            i++;
        }
        while(arr[j]>pivot && j<=low+1){
            j--;
        }
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        


      }
    }
        
    
    public static void main(String[] args) {
        int arr[] = {4,2,1,5,3};
        int low = 0;
        int high = arr.length -1;
        Quick(arr,low,high);

     }
}