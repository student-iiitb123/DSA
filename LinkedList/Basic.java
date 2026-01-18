import java.util.*;

public class Basic {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    

    public static void main(String[] args){
        Node n1 = new Node(1);
        Node n2 = new Node(4);

        System.out.println(n1.next);
         n1.next = n2;
        System.out.println(n1.next.data);




    }
}
