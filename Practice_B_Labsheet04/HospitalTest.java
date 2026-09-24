package Practice_B_Labsheet04;

/**
 * Program 9: Hospital Test
 * Integrates static, instance, and local variables,
 * a method, and a 2-D array.
 */
public class HospitalTest {

    // Shared by all HospitalTest objects.
    static String hospitalName = "City Hospital";

    // Different objects can have different patient names.
    String patientName;

    // Method displays the patient's test results.
    void displayResults() {

        /*
         * A 2-D array represents rows of tests
         * and columns of test values.
         */
        int[][] results = {
            {80, 75},
            {90, 85},
            {70, 65}
        };

        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient: " + patientName);
        System.out.println("Test Results:");

        // Traverse the rows of the 2-D array.
        for (int i = 0; i < results.length; i++) {

            // Print the two values in the current row.
            System.out.println(
                "Test " + (i + 1) + ": " +
                results[i][0] + ", " + results[i][1]
            );
        }
    }

    public static void main(String[] args) {

        // Create a HospitalTest object.
        HospitalTest p = new HospitalTest();

        // Set the instance variable.
        p.patientName = "Riya";

        // Call the instance method.
        p.displayResults();
    }
}