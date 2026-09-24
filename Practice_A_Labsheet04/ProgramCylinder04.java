package Practice_A_Labsheet04;

import java.util.Scanner;

public class ProgramCylinder04 {
 // Instance variables: each object gets its own values.
double radius;
double height;
 // Method returns the cylinder volume.
double calculateVolume() {
 return Math.PI * Math.pow(radius, 2) * height;
}
 // Method returns total surface area.
double calculateSurfaceArea() {
 return 2 * Math.PI * radius * (radius + height);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("Enter radius: ");
double r = sc.nextDouble();
System.out.print("Enter height: ");
double h = sc.nextDouble();
 // Create a Cylinder4 object.
ProgramCylinder04 c = new ProgramCylinder04();
 // Store local input values in instance variables.
c.radius = r;
c.height = h;
 // Call methods through the object.
System.out.println("Volume = " + c.calculateVolume());
System.out.println(
"Total Surface Area = " + c.calculateSurfaceArea()
);
sc.close();
}

}
