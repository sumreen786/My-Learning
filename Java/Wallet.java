package org.example.programPractice;


/* Create a class Wallet with:
          variable: amount
          methods: addMoney() and spendMoney()
          Create an object and test both methods.
 */
public class Wallet {
    int amount;

    void addMoney(int bal){
        amount = amount+bal;
        System.out.println("Amount Credited " + bal);
        System.out.println("Current Balance  " + amount);

    }

    void spendMoney(int bal){
        amount = amount - bal;
        System.out.println("Spent  " + bal);
        System.out.println("Balance Amount " + amount);
    }

    public static void main(String[] arrgs){
        Wallet wal = new Wallet();
        wal.addMoney(200);
        wal.spendMoney(50);
    }
}
