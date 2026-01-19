public class RecursionLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Recursion(Node prev, Node current){
        if(current == null){
            return prev;
        }

        Node next = current.next;
        current.next = prev;

        return Recursion(current, next);
    }

    public static void main(String[] args){
        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);

        Head = Recursion(null, Head);

        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
