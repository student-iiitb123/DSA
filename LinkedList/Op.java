public class Op {
       static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

   public static Node Reverse(Node Head){
    Node previous = null;
    Node current = Head;

    while(current != null){
        Node Next = current.next; 
        current.next = previous;  
        previous = current;      
        current = Next;           
    }
    return previous;
}

    public static void main(String[] args) {
          Node Head = new Node(1);
          Head.next = new Node(2);
          Head.next.next = new Node(3);
          Head.next.next.next = new Node(4);
        Reverse(Head);

        
      
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp =temp.next;
        }
           
           
    }
    
}
