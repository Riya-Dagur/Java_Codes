package Practice_A_Labsheet04;

import java.util.Scanner;

/**
 * Program 8: Dynamic arrays and user input.
 */
public class ProgramOfCylinder8 {

    double radius;
    double height;

    ProgramOfCylinder8(double r, double h) {
        radius = r;
        height = h;
    }

    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many cylinders? ");
        int n = sc.nextInt();

        // Array size is decided at runtime.
        double[] radii = new double[n];
        double[] heights = new double[n];

        // Read all dimensions.
        for (int i = 0; i < n; i++) {
            System.out.print("Radius " + (i + 1) + ": ");
            radii[i] = sc.nextDouble();

            System.out.print("Height " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        double totalVolume = 0;

        // Create and process each cylinder.
        for (int i = 0; i < n; i++) {

            ProgramOfCylinder8 c =
                new ProgramOfCylinder8(radii[i], heights[i]);

            double volume = c.calculateVolume();

            totalVolume = totalVolume + volume;

            System.out.println(
                "Cylinder " + (i + 1) +
                " Volume = " + volume
            );
        }

        System.out.println("Total Volume = " + totalVolume);

        sc.close();
    }
}
