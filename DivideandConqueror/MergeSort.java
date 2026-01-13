public class MergeSort {

    public static void printarr(int arr[]){
        for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }

    public static void mergearr(int arr[], int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int i = start ;
    
        int j = mid+1 ;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i] > arr[j]){
                temp[k] = arr[j];
                j++;
                k++;

            }
         else if(arr[j] >arr[i]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        while(j<=end){
            temp[k] = arr[j];
            j++;
            k++;
        }
         for(int x = 0; x < temp.length; x++){
            arr[start + x] = temp[x];
        }

    }
    public static void Merge(int arr[],int start,int end){
      if(start == end){
        return;
      }
        int mid = (start+end)/2;
        Merge(arr, start, mid);
        Merge(arr,mid+1,end);
        mergearr(arr,start,mid,end);

    }
    public static void main(String args[]){
        int arr[]= {70,30,50,10};
        Merge(arr,0,arr.length-1);
        printarr(arr);
    }
}
