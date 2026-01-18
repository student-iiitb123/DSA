public class InsertAtPosition {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static void insertAtPosition(Node Head, int data,int position) {
        
      Node temp = Head;
      int i =0;
      while(i != position-1){
        i++;
        temp = temp.next;
      }

      Node newNode = new Node(data);
      newNode.next = temp.next;
      temp.next = newNode;



        
    }

 



    public static void main(String[] args) {
         Node Head = new Node(1);
         Head.next = new Node(2);
         Head.next.next = new Node(3);
        insertAtPosition(Head, 0, 3);
         
        Node t= Head;
        while(t!=null){
            System.out.println(t.data);
            t= t.next;
        }










     



          





     
    }
}
