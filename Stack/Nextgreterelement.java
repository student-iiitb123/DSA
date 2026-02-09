public class Nextgreterelement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};

        //next gretest element 
        for(int i =0;i<arr.length;i++){
            int max = -2;
            int maxinarray =-2;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                 
                  max = arr[j];
                  maxinarray = Math.max(max, maxinarray);
                  break;
                }

               
              
      
            }
        if(maxinarray >arr[i]){
            arr[i] = maxinarray;
        }
        else{
            arr[i] = -1;
        }
        }

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
