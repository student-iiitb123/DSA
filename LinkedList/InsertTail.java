

public class InsertTail {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
         Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);

        Node temp = Head;
        while(temp.next != null){
            temp = temp.next;
            }

            Node newNode = new Node(0);

            temp.next = newNode;
            newNode.next = null;

           

        Node a = Head;

        while(a != null){
            System.out.print(a.data);
            a =a.next;
        }
        
        
    }
}
