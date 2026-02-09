
import java.util.Stack;


public class pushBottom {
    public static void pushAtbottom(Stack<Integer> s,int num){
        if(s.isEmpty()){
            s.add(num);
            return;
        }

        int top = s.pop();
        pushAtbottom(s, num);
        s.add(top);

              
    } 
    
    
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        pushAtbottom(s1,5);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
