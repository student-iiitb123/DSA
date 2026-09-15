class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
  

    void deposit(int amount){
        if(amount >0){
            balance =balance + amount;
        }
    }

    void withdraw(int amount){
        if(amount> 0 && amount <= balance){
            balance = balance-amount;
        }
    }


     void display(){
        System.out.println(accountHolder + " " + balance);

    }



    

}





public class PrivateBank {

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Rahul", 1000);
        b.deposit(500);
        b.withdraw(200);
        b.withdraw(2000);
        b.display();
        
    }
    
}
