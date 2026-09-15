class User{
    String name;
    String email;

    User(String name,String email){
    this.name = name;
    this.email = email;
     }

     void login(){
        System.out.println("login successfull");
     }

     void logout(){
        System.out.println("logut successfull");
     }
}
     

class Customer extends User{
    Customer(String name, String email) {
        super(name, email);
    }
    void placeHolder(){
        System.out.print("order placed");
    }
    
}

class PremiumCustomer extends Customer{

    public PremiumCustomer(String name,String email) {
        super(name,email);
    }
      void getPremiumDiscount() {
        System.out.println("Premium discount applied");
    }
}





public class Swiggy {
    public static void main(String[] args) {
       PremiumCustomer p = new PremiumCustomer("Rahul", "rahul@gmail.com");
       p.login();
       p.placeHolder();
       p.getPremiumDiscount();
       p.logout();
        

        
    }
    
}
