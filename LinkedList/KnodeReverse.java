

public class KnodeReverse {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseK(Node head, int k) {

        if (head == null) return null;

        Node current = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recursively reverse remaining list
        if (next != null) {
            head.next = reverseK(next, k);
        }

        return prev; // new head
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = new Node(5);
        Head.next.next.next.next.next = new Node(6);
        Head.next.next.next.next.next.next = new Node(7);

        int k = 2;

        Head = reverseK(Head, k);
        print(Head);
    }
}
