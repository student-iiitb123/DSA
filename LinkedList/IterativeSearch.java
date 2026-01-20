public class IterativeSearch {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
public static void IterativeSearch(Node head,int key){
    Node temp = head;
    int count = 0;
    while(temp != null){
        if(temp.data == key){
            System.out.println(count);
            return;
          
        }
        count++;
        temp = temp.next;

        
    }

    System.out.println("-1");
}
    public static void main(String[] args) {
         Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = new Node(5);
        Head.next.next.next.next.next = new Node(6);
        Head.next.next.next.next.next.next = new Node(7);

        IterativeSearch(Head,5);
    }
}
