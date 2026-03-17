import java.util.*;
public class kelement {
    public static void addk(Queue<Integer> q,int k){
        int count =0;
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(count != k){
            s1.push(q.remove());
            count++;
        }

        while(!q.isEmpty()){
            s2.push(q.remove());
        }

        while(!s1.isEmpty()){
            q.add(s1.pop());
        }

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        while(!s1.isEmpty()){
            q.add(s1.pop());
        }
      

    }
    public static void main(String[] args) {
        int k =3;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        addk(q,k);

        while(!q.isEmpty()){
       System.out.println(q.peek());
            q.remove();
        }
    }
}
