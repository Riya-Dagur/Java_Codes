import java.util.Scanner;
class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}
public class Q15OnlineExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Invalid exam marks!");
            }

            System.out.println("Student Marks: " + marks);

            if (marks >= 40) {
                System.out.println("Result: PASS");
            }
            else {
                System.out.println("Result: FAIL");
            }
        }
        catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric marks.");
        }
        finally {
            System.out.println("Exam evaluation completed.");
        }
        sc.close();
    }
}