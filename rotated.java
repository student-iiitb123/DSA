public class rotated {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        //rotate the array
        int i =0;
        int j = arr.length-1;
        int s =2;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int k =0;
        int g =s;
        // 5 4 3 2 1 
       while(k<s){
         int temp = arr[k];
            arr[k] = arr[g];
            arr[g] = temp;
            k++;
            g--;
       }
       int xx = s+1;
       int yy= arr.length-1;
       while(xx < yy){
         int temp = arr[xx];
         arr[xx] = arr[yy];
         arr[yy] = temp;
         yy--;
         xx++;
       }

       for(int m=0;m<arr.length;m++){
        System.out.print(arr[m]);
       }
        
   
  
    }
}
