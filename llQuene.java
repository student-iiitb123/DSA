public class llQuene {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static class quene{
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty(){
            return head == null && tail == null;
        }
         
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return ;
            }
            tail.next = newNode;
            tail = newNode;
          

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Quene is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;

            return front;
        }

      
    }
}
