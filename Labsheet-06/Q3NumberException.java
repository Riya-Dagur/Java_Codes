import java.util.Scanner;
public class Q3NumberException {
    public static void main(String[] args) {
        String number = "123";
        try {
            int num = Integer.parseInt(number);
            System.out.println("Integer Number: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}