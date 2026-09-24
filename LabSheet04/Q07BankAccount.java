package LabSheet04;

public class Q07BankAccount {
    long accountNumber;
    double balance;
    static String bankName = "State Bank";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        long account = 123456789;
        double initialBalance = 5000;
        double amount = 2000;

        Q07BankAccount b = new Q07BankAccount();
        b.accountNumber = account;
        b.balance = initialBalance;

        b.deposit(amount);
        b.display();
    }
}
