package Encapsulation;

public class Lab001_BankAccount {

    private String AccountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){

        if(amount > 0){
            balance = balance+amount;
            System.out.println("Balance after deposit is:  "+balance);
        }
        else {
            System.out.println("you cannot deposit 0 or Negative amount");
        }
    }
    public void withdraw(double amount){
        if(amount>balance)
        {
            System.out.println("Insufficient amount, cannot withdraw!");

        }
        else if(amount<=0){
            System.out.println("Can not withdraw 0 or negative amount");
        }
        else {
            balance = balance-amount;
            System.out.println("Balance after withdrawal is:  "+balance);
        }
    }

}
