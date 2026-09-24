package Practice_B_Labsheet04;

/**
 * Program 7: Student Marks
 * Demonstrates a 1-D array, method, and local variables.
 */
public class StudentMarks {

    // Method to calculate the average of the marks.
    static void calculateAverage() {

        // A 1-D array stores marks of five students.
        int[] marks = {80, 75, 90, 85, 70};

        // Local variable used to accumulate the total.
        int total = 0;

        // Enhanced for loop reads each array element.
        for (int mark : marks) {
            total = total + mark;
        }

        // Calculate average using the array length.
        double average = (double) total / marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {

        // Call the calculation method.
        calculateAverage();
    }
}
