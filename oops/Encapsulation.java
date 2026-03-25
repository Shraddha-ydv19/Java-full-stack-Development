package oops;
class BankAccount{
    private String account;
    private double balance;
    public BankAccount(String account, double balance){
        this.account=account;
        this.balance=balance;

    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("amount deposited");
        }
        else{
            System.out.println("invalid amount");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("amount withdrawn");
        }
        else{
            System.out.println("invalid amoount");
        }
    }
    double getBalance(){
        return balance;
    }
    
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount account=new BankAccount("1234",922992.0);
        account.deposit(200);
        account.withdraw(100);
        System.out.println("current balance: "+account.getBalance());
    }
}
