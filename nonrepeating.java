import java.util.*;
public class nonrepeating {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k= 3;
        int count =0;
        int max = 0;
        int maxnumber = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<arr.length;i++){
            
            if(count != k){
                q.add(arr[i]);
                if(max < arr[i]){
                    max = arr[i];
                }
                maxnumber =Math.max(max,maxnumber);
               count++;
            }
            else{
                q.remove(q.peek());
                count--;
            }

            System.out.println(maxnumber);

            

           
        }
          

    }
}
