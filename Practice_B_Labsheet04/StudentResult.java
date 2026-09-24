package Practice_B_Labsheet04;

/**
 * Program 10: Student Result System
 *
 * Complete integration of:
 * static, instance and local variables,
 * constructors, methods, and arrays.
 */
public class StudentResult {

    // One college name is shared by all StudentResult objects.
    static String collegeName = "ABC University";

    // Instance variables: each student has separate values.
    String studentName;
    int rollNo;
    int[] marks;

    // Default constructor.
    StudentResult() {

        // Provide default values for a new object.
        studentName = "Unknown";
        rollNo = 0;
        marks = new int[]{0, 0, 0};
    }

    /**
     * Parameterized constructor.
     * Receives student data and stores it in instance variables.
     */
    StudentResult(String name, int roll, int[] m) {
        studentName = name;
        rollNo = roll;
        marks = m;
    }

    // Method to calculate total marks.
    int calculateTotal() {

        // Local variable: exists only during this method call.
        int total = 0;

        // Add every mark from the array.
        for (int mark : marks) {
            total = total + mark;
        }

        return total;
    }

    // Method to calculate average marks.
    double calculateAverage() {

        // Local variable receives the result of another method.
        int total = calculateTotal();

        // Return average of all subjects.
        return (double) total / marks.length;
    }

    // Method to display the complete student result.
    void displayResult() {

        System.out.println("------------------------");

        // Static variable: shared college information.
        System.out.println("College: " + collegeName);

        // Instance variables: student-specific information.
        System.out.println("Student: " + studentName);
        System.out.println("Roll No: " + rollNo);

        System.out.println("Marks:");

        // Traverse the 1-D marks array.
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "Subject " + (i + 1) + ": " + marks[i]
            );
        }

        // Call methods to calculate total and average.
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    public static void main(String[] args) {

        // Local array containing marks for one student.
        int[] studentMarks = {85, 90, 78};

        /*
         * Create an object using the parameterized constructor.
         * The array is passed to the constructor.
         */
        StudentResult s1 =
            new StudentResult(
                "Riya", 46, studentMarks
            );

        // Display Riya's result.
        s1.displayResult();

        /*
         * Create another object using the default constructor.
         * Notice that this object receives default values.
         */
        StudentResult s2 = new StudentResult();
        // Display the second object's result. 
        s2.displayResult();
    }
}