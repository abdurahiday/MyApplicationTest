package test.myapplicationtest.bank;

/**
 * Created by rahman on 3/18/17.
 */

public class Bank {
    int acc_num;
    int acc_balance;

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.acc_balance = 100;
        System.out.println("Account balance: " + bank.acc_balance);
    }
}
