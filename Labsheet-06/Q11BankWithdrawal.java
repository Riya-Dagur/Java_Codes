import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Q11BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");
        }
        finally {
            System.out.println("Bank transaction completed.");
        }
        sc.close();
    }
}