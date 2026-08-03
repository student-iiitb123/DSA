import java.util.Arrays;

public class Overlap {
    public static void main(String[] args){
        int arr[][] = {{1,3},{7,9},{4,6},{10,13}};
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        boolean s = false;
        int start1 = arr[0][0];
        int end1 = arr[0][1];

        for(int i =1;i<arr.length;i++){
            int start2 = arr[i][0];
            int end2 = arr[i][1];

            if(end1 > start2){
                System.out.print("True");
                s = true;
                break;
            }else{
                start1 = start2;
                end1 = end2;
            }
        }
        if(s== false){
            System.out.print("False");
        }

    }
}
