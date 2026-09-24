package Practice_A_Labsheet04;

public class ProgramCylinder02 {
/**
 * Program 2: Cylinder with Math.pow().
 */
public class Cylinder2 {
public static void main(String[] args) {
 // Fixed dimensions.
double radius = 5.0;
double height = 10.0;
 // Math.pow(radius, 2) calculates radius squared.
double radiusSquared = Math.pow(radius, 2);
 // Volume formula.
 double volume = Math.PI * radiusSquared * height;
 // Total surface area formula.
double surfaceArea =
 2 * Math.PI * radius * (radius + height);
System.out.println("Volume = " + volume);
System.out.println("Total Surface Area = " + surfaceArea);
}
}
}
