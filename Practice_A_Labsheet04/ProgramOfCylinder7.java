package Practice_A_Labsheet04;

/**
 * Program 7: Arrays, loops and multiple objects.
 */
public class ProgramOfCylinder7 {

    // Instance variables.
    double radius;
    double height;

    // Parameterized constructor.
    ProgramOfCylinder7(double r, double h) {
        radius = r;
        height = h;
    }

    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    void display(int number) {
        System.out.println("Cylinder " + number);
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + calculateVolume());
    }

    public static void main(String[] args) {

        // Arrays store dimensions for multiple cylinders.
        double[] radii = {2, 3, 4};
        double[] heights = {5, 6, 7};

        // Loop through all array elements.
        for (int i = 0; i < radii.length; i++) {

            // Create an object for the current values.
            ProgramOfCylinder7 c =
                new ProgramOfCylinder7(radii[i], heights[i]);

            // Call the object's method.
            c.display(i + 1);

            System.out.println();
        }
    }
}