
public class union {
public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {2,3,4,5};
    int n = arr1.length  + arr2.length;
    int arr3[] = new int[n];
    int i =0;
    int j =0;
    int k = 0;
    while(i< arr1.length && j< arr2.length){
        if(arr1[i] < arr2[j]){
             if (k == 0 || arr3[k-1] != arr1[i]){
  arr3[k]= arr1[i] ;
             k++;

             }
           i++;
          
        }
        else if(arr1[i] > arr2[j]){
              if (k == 0 || arr3[k-1] != arr2[j]){
               arr3[k] = arr2[j];
                  k++;
              }
           
            j++;
         

        }
        else{
             if (k == 0 || arr3[k-1] != arr1[i]){
                  arr3[k] =arr1[i];
                    k++;
             }
           
            i++;
            j++;
           
        }
    }

        while(j < arr2.length){
            if (k == 0 || arr3[k-1] != arr2[j]) {
                arr3[k++] = arr2[j];
            }
            j++;
        }
      while(i < arr1.length){
            if (k == 0 || arr3[k-1] != arr1[i]) {
                arr3[k++] = arr1[i];
            }
            i++;
        }

        for(int l=0;l<arr3.length;l++){
            System.out.println(arr3[l]);
        }
    }
   
}
    

