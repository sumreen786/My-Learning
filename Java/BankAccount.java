package org.example.programPractice;

//9.	Create a class BankAccount with:
//	             variable: balance
//	             method: deposit() and withdraw()
//	             create an object and test the methods.

public class BankAccount {

    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current Balance: " + balance);

    }

    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);

    }


    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(200);
        ba.withdraw(50);

    }
}
