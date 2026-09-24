package LabSheet04;

public class Q02Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    double calculateArea() {
        double area = length * breadth;
        return area;
    }

    void display() {
        double area = calculateArea();

        System.out.println("Shape: " + shapeName);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        double l = 10;
        double b = 5;

        Q02Rectangle r = new Q02Rectangle();
        r.length = l;
        r.breadth = b;

        r.display();
    }
}
