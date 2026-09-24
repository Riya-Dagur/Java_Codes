package Practice_A_Labsheet04;

import java.util.Scanner;

public class ProgramCylinder05 {
    // Instance variables.
double radius;
double height;
 // Parameterized constructor initializes the object.
ProgramCylinder05(double r, double h) {
radius = r;
height = h;
}
double calculateVolume() {
return Math.PI * Math.pow(radius, 2) * height;
}
double calculateSurfaceArea() {
 return 2 * Math.PI * radius * (radius + height);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius: ");
double r = sc.nextDouble();
System.out.print("Enter height: ");
double h = sc.nextDouble();
 // Constructor receives the user values.
ProgramCylinder05 c = new ProgramCylinder05(r, h);
System.out.println("Volume = " + c.calculateVolume());
System.out.println(
"Total Surface Area = " + c.calculateSurfaceArea()
);
sc.close();
}

}
