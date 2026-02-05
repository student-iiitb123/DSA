public class reversellmid {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }


    public static Node  Reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            }
      return prev;
    }
    public static Node  mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
       return slow;

    }
    public static boolean palindrome(Node head){

        Node m = mid(head);

        Node firsthalf = head;
        Node Secondhalf= Reverse(m);

        while(Secondhalf != null){
            if(firsthalf.data != Secondhalf.data){
           return false;
            }

            firsthalf= firsthalf.next;
            Secondhalf =Secondhalf.next;
        }
        return true;




    }
    public static void main(String[] args) {
          Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(2);
         Head.next.next.next = new Node(1);
        
        System.out.println(palindrome(Head));

    }
}
