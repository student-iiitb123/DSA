class BankAccount{
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance =balance;
    }

    void deposit(int amount){
        balance = balance + amount;

    }

    void withdraw(int amount){
        balance = balance- amount;

    }
    
    void display(){
        System.out.println(accountHolder + " " + balance);

    }

    
}


public class Bank {
    public static void main(String[] args) {
        
    
  BankAccount a = new BankAccount("Rahul",1000);
   a.deposit(500);
 a.withdraw(200);
 a.display();

    }

    
}
