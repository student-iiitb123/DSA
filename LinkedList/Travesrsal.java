

public class Travesrsal {
    public static  class Node {
        int data;
        Node next;


       Node(int data){
      this.data = data;
      this.next = null;

       }
        }
        public static void main(String args[]){
            Node head = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);

            head.next = n2;
            head.next.next = n3;


        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp =temp.next;
        }
           


        }

    }


