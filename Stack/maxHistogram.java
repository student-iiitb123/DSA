import java.util.*;

public class maxHistogram{
    public static void main(String[] args){
        int arr[]  = {2,1,5,6,2,3};
         
        int rightBoundry[] = new int[arr.length];
        int leftBoundry[] =  new int[arr.length];
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s1 = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){

                rightBoundry[i] = arr.length;

            }
            else{

                rightBoundry[i] = s.peek();

            }

            s.push(i);
        }

       
for(int i = 0;i<arr.length;i++){
           while(!s1.isEmpty() && arr[s1.peek()] >= arr[i]){
                s1.pop();

            }
            if(s1.isEmpty()){

                leftBoundry[i] = -1 ;

            }
            else{

                leftBoundry[i] = s1.peek();

            }

            s1.push(i);
        }

        


      



       //area = height * width;
     
      int  maxArea = 0;

       
       for(int i =0;i<arr.length;i++){
        int height = arr[i];
      int left =   leftBoundry[i] ;
      int right = rightBoundry[i];
      int Area = height * (right - left -1);
     
  
       maxArea=  Math.max(Area, maxArea);


       }
        
         System.out.println(maxArea);
         

      
    }
}