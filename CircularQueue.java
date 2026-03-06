import java.util.*;

public class CircularQueue {

    int arr[];
    int front = -1;
    int rear = -1;
    int size;

    CircularQueue(int size){
        this.size = size;
        arr = new int[size];
    }

   
    void enqueue(int val){

        // full
        if((rear + 1) % size == front){
            System.out.println("Queue Overflow");
            return;
        }

        // first element
        if(front == -1){
            front = rear = 0;
        }
        else{
            rear = (rear + 1) % size;
        }

        arr[rear] = val;
    }

    // DEQUEUE
    void dequeue(){

        if(front == -1){
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + arr[front]);

        // last element
        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1) % size;
        }
    }

    // PRINT
    void display(){

        if(front == -1){
            System.out.println("Empty");
            return;
        }

        int i = front;

        while(true){
            System.out.print(arr[i] + " ");

            if(i == rear) break;

            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();
        q.dequeue();

        q.enqueue(5);
        q.enqueue(6);

        q.display();
    }
}
