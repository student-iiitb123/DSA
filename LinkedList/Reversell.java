

public class Reversell {
    public static  class Node {
        int data;
        Node next;


       Node(int data){
      this.data = data;
      this.next = null;

       }
        }

        public static Node Reverse(Node head){
            Node prev = null;
            Node current = head;

            while(current != null){
                Node Next = current.next;
                current.next = prev;
                prev = current;
                current = Next;
               


            }
           return prev;
        }
    public static void main(String[] args) {
            Node Head = new Node(1);
           Head.next = new Node(2);
           Head.next.next = new Node(3);
           Head.next.next.next =new Node(4);

        Head=   Reverse(Head);

              
      
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data);
            temp =temp.next;
        }
           
        
    }

    
}
