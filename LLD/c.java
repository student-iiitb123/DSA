import java.util.concurrent.locks.ReentrantLock;

class Counter {
   private int count;
   private ReentrantLock lock = new ReentrantLock();
  
  void increment(){
     lock.lock();
       
        try {
          for(int i = 0;i<1000;i++){
             count++;
          }
       } 
       finally{
        lock.unlock();
       }
    }

    int display(){
       return count;
    }
}
public class c{
    public static void main(String[] args) {
    Counter c = new Counter();
    Thread t1 = new Thread(() -> {
      c.increment();
       });
       t1.start();
    Thread t2 = new Thread(() -> {
    c.increment();
    });
    t2.start();

    Thread t3= new Thread(() -> {
    c.increment();
    });
   t3.start();

   Thread t4 = new Thread(() -> {
    c.increment(); 
    });

    t4.start();

    Thread t5 = new Thread(() -> {
        c.increment();
    });
    t5.start();



    c.display();

  




        
    }
    
}