import java.util.*;
public class Greater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextgreater[] = new int[arr.length];
   Stack<Integer> s = new Stack<>();

for(int i =arr.length-1;i>=0;i--){
    while(!s.isEmpty() && s.peek() < arr[i]){
        s.pop();
    }

    if(s.isEmpty()){
        nextgreater[i] = -1;

    }
    else{
        nextgreater[i] = s.peek();
    }

    s.push(arr[i]);
}

for(int i =0;i<nextgreater.length;i++){
    System.out.println(nextgreater[i]);
}
    }
}
