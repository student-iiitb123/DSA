import java.util.*;

public class pushAtbottom {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        int value = 5; // push at bottom

        // Step 1: move all to temp
        while(!s1.isEmpty()){
            temp.push(s1.pop());
        }

        // Step 2: push new element (bottom)
        s1.push(value);

        // Step 3: restore back
        while(!temp.isEmpty()){
            s1.push(temp.pop());
        }

        // print
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
