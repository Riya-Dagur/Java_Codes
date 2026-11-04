import java.util.Scanner;
class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}
public class Q12Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Invalid patient age!");
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Patient Registration Successful.");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid age.");
        }
        sc.close();
    }
}