
impo
public class ReverseKGroup {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static void ReverseK(Node head){
        Node current = head;
        Node prev = null;

        int count = 0;
        while(current != null && count < 2){
        count++;
         Node Next = current.next;
        current = Next;
        prev = current;


        }

       


    }

  
    public static void main(String[] args) {
          Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
         Head.next.next.next = new Node(4);

         ReverseK(Head);
    }
}
