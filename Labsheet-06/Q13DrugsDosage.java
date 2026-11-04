import java.util.Scanner;
class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}
public class Q13DrugsDosage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Invalid drug dosage!");
            }
            System.out.println("Patient Name: " + patient);
            System.out.println("Drug Name: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage is valid.");
        }
        catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
        finally {
            System.out.println("Dosage validation completed.");
        }
        sc.close();
    }
}