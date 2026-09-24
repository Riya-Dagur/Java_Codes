package Practice_B_Labsheet04;

/**
 * Program 4: BMI
 * Demonstrates a method containing local variables.
 */
public class BMI {

    // This method calculates and displays BMI.
    static void calculateBMI() {

        // These variables exist only inside this method.
        double weight = 70;
        double height = 1.75;

        // BMI formula: weight / (height * height)
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);
    }

    public static void main(String[] args) {

        // Call the method from main().
        calculateBMI();
    }
}
