import java.util.*;

public class Twostack {

    public static class Quene {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int result = s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return result;
        }
    }

    public static void main(String[] args) {

        Quene q = new Quene();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}