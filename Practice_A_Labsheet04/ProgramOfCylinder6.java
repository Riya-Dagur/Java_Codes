//   Program 6: Constructors and static variable.
package Practice_A_Labsheet04;
import java.util.Scanner;

public class ProgramOfCylinder6 {

    // Static variable: one shared value for the class.
    static String unit = "cm";


    // Instance variables: separate for each object.
    double radius;
    double height;

    // Default constructor: no parameters.
    ProgramOfCylinder6() {
        radius = 1;
        height = 1;
    }

    // Parameterized constructor.
    ProgramOfCylinder6(double r, double h) {
        radius = r;
        height = h;
    }
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    void display() {
        System.out.println("Radius = " + radius + " " + unit);
        System.out.println("Height = " + height + " " + unit);
        System.out.println("Volume = " + calculateVolume());
    }

    public static void main(String[] args) {

        // Object created with default constructor.
        ProgramOfCylinder6 c1 = new ProgramOfCylinder6();
        System.out.println("Default Constructor:");
        c1.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        // Object created with parameterized constructor.
        ProgramOfCylinder6 c2 = new ProgramOfCylinder6(r, h);
        System.out.println("Parameterized Constructor:");
        c2.display();

        sc.close();
    }
}
