public class reversemidpart {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     public static Node Reverse(Node head,int left,int right){
        Node left1 = head;
        Node right1 = head;
        int countl = 0;
        int countr= 0;
        while(countl < left){
            countl++;
            left1 = left1.next;
        }
       left1.next = head;
          while(countr < right){
         countr++;
         right1 = right1.next;
     }
      right1.next = null;

      Node prev = null;
      Node current = left1;
      Node next = null;

      while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current= next;
      }

      return prev;
     }

   



    

    
    
    public static void main(String[] args) {
          Node head = new Node(1);
          head.next = new Node(2);
          head.next.next = new Node(3);
          head.next.next.next = new Node(4);
       Node t =   Reverse(head,1,3);

      Node temp = t;
      while(temp != null){
        System.out.print(temp.data);
        temp = temp.next;
      }

    }
}
