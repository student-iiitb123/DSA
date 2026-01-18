

public class InsertHead {
       static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static Node Inserthead(Node Head,int data){
        Node newNode = new Node(data);
        newNode.next = Head;
        Head = newNode;
        return Head;



    }
    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);

     

         Head =Inserthead(Head,0);
   printList(Head);
    }
}
