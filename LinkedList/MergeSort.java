
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
    public static Node getmid(Node Head){
      Node slow = Head;
      Node fast = Head.next;
    
      while(fast != null && fast.next != null){
       
        slow = slow.next;
        fast = fast.next.next;


      }
      return slow;
    }

    public static 
    public static void MergeSort(Node Head){
        //find mid;
       Node mid = getmid(Head);
    
       Node rightHead = mid.next;
       mid.next = null;

       MergeSort(Head);
       MergeSort(rightHead);
       merge(Head,rightHead);
     


        //right side 
        //left side 


    }
    public static void main(String[] args) {
            Node Head = new Node(1);
          Head.next = new Node(2);
          Head.next.next = new Node(3);
          Head.next.next.next = new Node(4);

    
      MergeSort(Head);
     
       //merge
    }
}
