class Car{
    String brand;
    int speed;

     void fun(String b,int s){
     brand = b;
     speed = s;
     }
   
      int accelerate(){
      return speed = speed+20;
    }

       int brake(){
        return speed = speed-10;
    }
    
        void display(){
        System.out.println(brand + " " + speed);
    }

}


public class Cars{
    public static void main(String args[]){
        Car BMW = new Car();
        Car Audi = new Car();

        BMW.fun("BMW", 50);
        Audi.fun("Audi", 100);

        BMW.accelerate();
        BMW.accelerate();
        Audi.brake();

        BMW.display();
        Audi.display();




      



    }
    
}