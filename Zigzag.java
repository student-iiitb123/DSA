public class Zigzag {
    public static void main(String[] args) {
       
        int arr[] = {1,2,3,4,5};
         int brr[] = new int[arr.length];
        int i =0;
        int j = arr.length-1;
        int k =0;
        while(i<arr.length){
            brr[k++] = arr[i++];
            
        if(k==arr.length) break;
       
            brr[k++] = arr[j--];
           
}
for(k=0;k<brr.length;k++){
    System.out.println(brr[k]);
}
    }
}
