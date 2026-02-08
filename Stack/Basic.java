import java.util.*;
public class Basic{

    public static int push(int num,int arr[],int capacity,int top){
      
        if(top == capacity-1){
             System.out.println("index out of bound");
              return top;
        }
        top = top + 1;
        arr[top] = num;

        return top;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int top = -1;
        int arr[] = new int[n];
        int capacity = arr.length;
      top = push(1, arr, capacity, top);
        top = push(2, arr, capacity, top);
        top = push(3, arr, capacity, top);
      for(int i = 0;i<=top;i++){
        System.out.println(arr[i]);
      }





        
    }
}