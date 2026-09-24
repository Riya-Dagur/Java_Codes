package Practice_B_Labsheet04;

/**
 * Program 6: Patient
 * Demonstrates a parameterized constructor.
 */
public class Patient {

    // Instance variables store patient-specific information.
    String name;
    int patientId;
    int age;
    String disease;

    /**
     * Parameterized constructor initializes a patient
     * using values supplied during object creation.
     */
    Patient(String n, int id, int a, String d) {
        name = n;
        patientId = id;
        age = a;
        disease = d;
    }

    public static void main(String[] args) {

        // Pass values to the parameterized constructor.
        Patient p = new Patient(
            "Riya", 152, 25, "Fever"
        );

        // Display the initialized object data.
        System.out.println("Patient Name: " + p.name);
        System.out.println("Patient ID: " + p.patientId);
        System.out.println("Age: " + p.age);
        System.out.println("Disease: " + p.disease);
    }
}
