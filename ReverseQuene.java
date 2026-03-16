import java.util.*;
public class ReverseQuene {

    public static void Reverse(Queue<Integer> q){
        Stack<Integer> s1 = new Stack<>();
        while(!q.isEmpty()){
            s1.push(q.remove());
        }

        while(!s1.isEmpty()){
            q.add(s1.pop());
        }

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Reverse(q);
    }
}
