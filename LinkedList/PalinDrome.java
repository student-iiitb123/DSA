import java.util.ArrayList;

public class PalinDrome {
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
public static boolean Check(ArrayList<Integer> list) {
    int i = 0;
    int j = list.size() - 1;

    while (i < j) {
        if (!list.get(i).equals(list.get(j))) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}

  public static  void Palindrome(Node Head,ArrayList<Integer> List){
    Node temp = Head;
    while(temp != null){
        List.add(temp.data);
        temp = temp.next;

    }
    boolean c = Check(List);
    System.out.println(c);

  }

    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(1);

        Palindrome( Head,new ArrayList<Integer>());
    }

}
