import java.util.*;

public class hasmap2{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
               public Node(K key, V value){
                this.key = key;
                this.value = value;
             }
        }
  private int size ; // total no of node;

  private LinkedList<Node> buckets[];
  //private int arr[]

  public HashMap() {
     this.size = 0;
     this.buckets = new LinkedList[4];
     for(int i =0;i<4;i++){
        this.buckets[i] = new LinkedList<>();
     }

    }


    public void put (K key, V value){
        int bi = hashFunction(key);
          int di = SearchinLinkedList(key);
          
    }
  }


        
    }
public static void main(String[] args) {
    
}
}