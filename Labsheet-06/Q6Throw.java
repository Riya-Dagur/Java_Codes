import java.util.Scanner;
public class Q6Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100) {
                throw new ArithmeticException("Invalid marks!");
            }
            System.out.println("Student Marks: " + marks);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}