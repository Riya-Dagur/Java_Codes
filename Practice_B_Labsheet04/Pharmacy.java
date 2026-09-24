package Practice_B_Labsheet04;

/**
 * Program 8: Pharmacy
 * Demonstrates arrays, instance variables,
 * and a parameterized constructor.
 */
public class Pharmacy {

    // Instance arrays belong to each Pharmacy object.
    String[] medicines;
    double[] prices;

    // Constructor receives two arrays as parameters.
    Pharmacy(String[] m, double[] p) {
        medicines = m;
        prices = p;
    }

    public static void main(String[] args) {

        // Local array containing medicine names.
        String[] medicineList = {
            "Paracetamol", "Aspirin", "Ibuprofen"
        };

        // Local array containing corresponding prices.
        double[] priceList = {
            5.50, 8.00, 12.50
        };

        /*
         * Create the Pharmacy object.
         * The parameterized constructor receives both arrays.
         */
        Pharmacy pharmacy =
            new Pharmacy(medicineList, priceList);

        // Display each medicine and its price.
        for (int i = 0; i < pharmacy.medicines.length; i++) {
            System.out.println(
                pharmacy.medicines[i] + " - ₹" +
                pharmacy.prices[i]
            );
        }
    }
}
