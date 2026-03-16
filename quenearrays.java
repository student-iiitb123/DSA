public class quenearrays {
    public static  class Quene{
    static   int size;
    static   int arr[];
    static   int rear;

   Quene(int n){
     size = n;
     arr = new int[size];
     rear = -1;
    }

    public static boolean  isEmpty(){
        return rear == -1;
    }

    public static void add(int data){
        if(rear == arr.length -1){
            System.out.println("Quene is full");
            return;
        }
      rear = rear +1;
      arr[rear] = data;
    }

    public static void remove(){
        if(rear == -1){
            System.out.println("Quene is Empty");
        }

        for(int i =0;i<=rear;i++){
            arr[i] = arr[i+1];
          
        }
          rear--;

    }

    public static int peek(){
        if(rear == -1){
            System.out.println("Quene is Empty");
            return -1;
        }
        return arr[0];
    }
    

    }
   
   
    public static void main(String[] args) {
    Quene q = new Quene(5);
    q.add(1);
    q.add(2);
    q.add(3);
   

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }





    }
}
