package LabSheet04;

public class Q20BankAccount {
    double balance;
    static String bankCode = "SBI001";

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= balance) {
            double newBalance = balance - withdrawalAmount;
            balance = newBalance;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        double initialBalance = 10000;
        double amount = 3000;

        Q20BankAccount b = new Q20BankAccount();
        b.balance = initialBalance;

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Balance: " + b.balance);

        b.withdraw(amount);
    }
}