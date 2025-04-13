package Encapsulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_BankAccountAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number ");
        String acc = sc.nextLine();
        Lab001_BankAccount ba = new Lab001_BankAccount();
        ba.setAccountNumber(acc);
        ba.deposit(500);
        ba.withdraw(2000);
        System.out.println("Account Number "+ba.getAccountNumber());
        System.out.println("Total balance  "+ba.getBalance());


    }
}
