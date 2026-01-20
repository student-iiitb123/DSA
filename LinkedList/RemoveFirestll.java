public class RemoveFirestll {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node RemoveFirst(Node Head){
Node temp = Head;
 temp = Head.next;
 Head = temp;

return temp;
      
    }
    public static void main(String[] args) {
          Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
         Head.next.next.next = new Node(4);

     Head =    RemoveFirst(Head);
     Node temp = Head;
     while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
     }
    }
    
}
