

public class LeftRotate {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int num = arr[0];
        for(int j =1;j<=arr.length-1;j++){
            arr[j-1] = arr[j];
        }
         arr[arr.length-1] = num;
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
