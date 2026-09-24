package LabSheet04;

public class Q16Triangle {
    double a;
    double b;
    double c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkValidity() {
        double side1 = a;
        double side2 = b;
        double side3 = c;

        if (side1 + side2 > side3 &&
            side1 + side3 > side2 &&
            side2 + side3 > side1) {

            String triangleType;

            if (side1 == side2 && side2 == side3) {
                triangleType = "Equilateral";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                triangleType = "Isosceles";
            } else {
                triangleType = "Scalene";
            }

            System.out.println("Valid Triangle");
            System.out.println("Type: " + triangleType);
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        double x = 5;
        double y = 6;
        double z = 7;

        Q16Triangle t = new Q16Triangle();
        t.a = x;
        t.b = y;
        t.c = z;

        t.checkValidity();
    }
}
