public class QueneArray{
    public static class Quene{
       static int size;
       static int arr[];
      
        static int  rear;

        Quene(int n){
            size = n;
           arr= new int[size];
           rear = -1;


         


        }
        //is Empty function in the quene 

  public static  boolean isEmpty(){
            return rear == -1;
           }

           //add function

        public static void add(int val){
         if(rear == size-1) {
            System.out.println("Quene is full");
            return;
         }
            rear = rear +1;
            arr[rear] = val;
        
           }


           public static int remove(){
          if(isEmpty()){
            System.out.print("Quene is empty");
          }

          int front = arr[0];
          for(int i =0;i<rear;i++){
            arr[i] = arr[i+1];
           

          }

           rear = rear -1;
          return  front;
           }

           public static int peek(){
            if(isEmpty()){
                System.out.println("qunee is empty");
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