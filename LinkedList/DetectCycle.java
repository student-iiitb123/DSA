public class DetectCycle {
      static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static boolean Cycle(Node Head){
        Node fast = Head;
        Node slow = Head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         Node Head = new Node(1);
         Head.next = new Node(2);
         Head.next.next = new Node(3);
         Head.next.next.next =Head;

        boolean t = Cycle(Head);
        System.out.print(t);
         
    }
}
