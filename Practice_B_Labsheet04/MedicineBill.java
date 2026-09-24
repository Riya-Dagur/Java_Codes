package Practice_B_Labsheet04;

/**
 * Program 1: Medicine Bill
 * Demonstrates local variables and basic arithmetic.
 */
public class MedicineBill {

    public static void main(String[] args) {

        // Medicine name is stored in a local variable.
        String medicineName = "Paracetamol";

        // Quantity purchased by the patient.
        int quantity = 10;

        /* Price of one medicine unit.
           This is also a local variable. */
        double price = 5.50;

        // Calculate the total bill.
        double total = quantity * price;

        System.out.println("Medicine: " + medicineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
        System.out.println("Total Bill: ₹" + total);
    }
}
