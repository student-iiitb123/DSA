import java.util.*;
public class StackArrayList {


   
    public static int push(int num,int top,ArrayList<Integer> a){
        top = top+1;
        a.add(num);
        return top;

    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int top = -1;
      top =  push(1,top,a);
      top= push(2,top,a);
      top= push(3,top,a);

      for(int i =0;i<=top;i++){
    System.out.println(a.get(i));
      }
    }
    
}
