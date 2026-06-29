



public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0,1};
      int i =0;
    int j =0;
    while(j<arr.length && i<arr.length){
        if(arr[i] != 0){
            i++;
            j++;

        }
        else{
            j++;
           if(j<arr.length && arr[j] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
           }else{
        while(j < arr.length && arr[j] != 0){
                j++;
             int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            }
           }
        }

    }

    for(int l =0;l<arr.length;l++){
        System.out.println(arr[l]);
    }
    }
    
}
