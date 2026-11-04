import java.util.Scanner;
public class Q7Throws {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("Eligible to vote.");
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}