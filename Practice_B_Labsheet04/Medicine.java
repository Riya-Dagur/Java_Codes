package Practice_B_Labsheet04;

/**
 * Program 5: Medicine
 * Demonstrates a default constructor and instance variables.
 */
public class Medicine {

    // These are instance variables.
    String medicineName;
    double price;

    // Default constructor: it has no parameters.
    Medicine() {

        // Initialize instance variables when the object is created.
        medicineName = "Paracetamol";
        price = 5.50;
    }

    public static void main(String[] args) {

        /*
         * new creates the Medicine object.
         * The default constructor runs automatically.
         */
        Medicine m = new Medicine();

        System.out.println("Medicine: " + m.medicineName);
        System.out.println("Price: ₹" + m.price);
    }
}
