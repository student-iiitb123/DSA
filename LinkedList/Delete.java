public class Delete {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static void DeletePosition(Node Head , int position ){
        int i =0;
        Node temp = Head;
        while(i == position-1){
            i++;
            temp = temp.next;
        }

       temp.next = temp.next.next;

    }
    public static void main(String[] args) {
         Node Head = new Node(1);
         Head.next = new Node(2);
         Head.next.next = new Node(3);
            Head.next.next.next = new Node(4);
         DeletePosition(Head,2);


           Node t= Head;
        while(t!=null){
            System.out.println(t.data);
            t= t.next;
        }
    }

}
