public class Reverse {
       static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static void Reverse(Node Head){
        Node a = Head;
        Node temp = Head;
        while(temp.next != null){
               temp = temp.next;


        }

        Node tail = temp;

        int t = tail.data;
        tail.data = Head.data;
        Head.data = t;

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
