public class circular {

    static class CircularQuene {

        static int arr[];
        static int front = -1;
        static int rear = -1;
        static int size;

        CircularQuene(int size){
            this.size = size;
            arr = new int[size];
        }

        public static void add(int data){

            if((rear + 1) % size == front){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){

            if(front == -1){
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
            }

            return result;
        }

        public static boolean isEmpty(){
            return front == -1;
        }

        public static int peek(){

            if(front == -1){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        CircularQuene q = new CircularQuene(5);

        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}