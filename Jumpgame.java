public class Jumpgame {
    public static void main(String[] args) {
        int nums[] = {3,2,1,0,4};
         int size = nums.length-1;
        int i =0;
        int count = 0;
        while(i<size){
           int pick = nums[i];
           if(pick == 0){
            break;
           }
              count = count + pick;
           i = count;
        }
        if(count == size ){
          System.out.println("true");

        }
        else{
            System.out.println("False");
        }
        
    }
}
