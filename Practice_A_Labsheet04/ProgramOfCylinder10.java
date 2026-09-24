package Practice_A_Labsheet04;

import java.util.Scanner;

/**
 * Program 10: FINAL Cylinder Management System
 *
 * Complete integration:
 * class, objects, constructors, methods,
 * local/instance/static variables, constant,
 * arrays, loops, Scanner, Math and conditions.
 */
public class ProgramOfCylinder10 {

    // Static final: shared constant that cannot be reassigned.
    static final double PI = Math.PI;

    // Static variable: shared counter for valid objects.
    static int objectCount = 0;

    // Instance variables: each object stores its own dimensions.
    double radius;
    double height;

    // Parameterized constructor.
    ProgramOfCylinder10(double r, double h) {
        radius = r;
        height = h;

        // Increase shared count when a valid object is created.
        objectCount++;
    }

    // Return cylinder volume.
    double calculateVolume() {
        return PI * Math.pow(radius, 2) * height;
    }

    // Return curved surface area.
    double calculateCurvedSurfaceArea() {
        return 2 * PI * radius * height;
    }

    // Return total surface area.
    double calculateTotalSurfaceArea() {
        return 2 * PI * radius * (radius + height);
    }

    // Display one cylinder's information.
    void display(int number) {

        System.out.println("\nCylinder " + number);
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + calculateVolume());

        System.out.println(
            "Curved Surface Area = "
            + calculateCurvedSurfaceArea()
        );

        System.out.println(
            "Total Surface Area = "
            + calculateTotalSurfaceArea()
        );
    }

    public static void main(String[] args) {

        // Scanner receives user input.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cylinders: ");
        int n = sc.nextInt();

        // Validate the requested number.
        if (n <= 0) {

            System.out.println(
                "Number of cylinders must be greater than 0."
            );

        } else {

            // Arrays store input and calculated results.
            double[] radii = new double[n];
            double[] heights = new double[n];
            double[] volumes = new double[n];

            // First loop: collect all user input.
            for (int i = 0; i < n; i++) {

                System.out.println(
                    "\nEnter details for Cylinder " + (i + 1)
                );

                System.out.print("Radius: ");
                radii[i] = sc.nextDouble();

                System.out.print("Height: ");
                heights[i] = sc.nextDouble();
            }

            // Local variables for summary calculations.
            double totalVolume = 0;
            double largestVolume = 0;
            int largestCylinder = 0;

            // Second loop: validate, create objects and calculate.
            for (int i = 0; i < n; i++) {

                // Reject invalid dimensions.
                if (radii[i] <= 0 || heights[i] <= 0) {

                    System.out.println(
                        "Invalid dimensions for Cylinder "
                        + (i + 1)
                    );

                    volumes[i] = 0;

                } else {

                    // Create object using the parameterized constructor.
                    ProgramOfCylinder10 c =
                        new ProgramOfCylinder10(
                            radii[i], heights[i]
                        );

                    // Store calculated result in the array.
                    volumes[i] = c.calculateVolume();

                    // Add current volume to the total.
                    totalVolume =
                        totalVolume + volumes[i];

                    // Compare to find the largest cylinder.
                    if (volumes[i] > largestVolume) {

                        largestVolume = volumes[i];
                        largestCylinder = i + 1;
                    }

                    // Display this object's calculations.
                    c.display(i + 1);
                }
            }

            // Average volume based on all entered records.
            double averageVolume = totalVolume / n;

            System.out.println(
                "\n========== FINAL REPORT =========="
            );

            System.out.println(
                "Valid Objects Created = " + objectCount
            );

            System.out.println(
                "Total Volume = " + totalVolume
            );

            System.out.println(
                "Average Volume = " + averageVolume
            );

            // Check whether at least one valid object exists.
            if (objectCount > 0) {

                System.out.println(
                    "Largest Cylinder = " + largestCylinder
                );

                // Math.round() produces an easy-to-read whole number.
                System.out.println(
                    "Largest Volume (rounded) = "
                    + Math.round(largestVolume)
                );

            } else {

                System.out.println(
                    "No valid cylinder was created."
                );
            }
        }

        // Release the Scanner resource.
        sc.close();
    }
}