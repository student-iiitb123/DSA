
import com.sun.net.httpserver.Headers;

public class MergeSort {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node mid(Node Head){
      Node slow = Head;
      Node fast = Head.next;
    
      while(fast != null && fast.next != null){
       
        slow = slow.next;
        fast = fast.next.next;


      }
      return slow;
    }
    public static void MergeSort(Node Head,Node mid){

    }
    public static void main(String[] args) {
            Node Head = new Node(1);
          Head.next = new Node(2);
          Head.next.next = new Node(3);
          Head.next.next.next = new Node(4);

       Node s =   mid(Head);
       MergeSort(Head,s);
       System.out.print(s.data);
    }
}
