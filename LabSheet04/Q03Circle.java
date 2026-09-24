package LabSheet04;

public class Q03Circle {
    double radius;
    static double PI = 3.14;

    void display() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        double r = 7;

        Q03Circle c = new Q03Circle();
        c.radius = r;

        c.display();
    }
}