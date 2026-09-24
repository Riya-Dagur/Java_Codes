package LabSheet04;

public class Q08Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    void display() {
        String penColor = color;
        String penType = type;
        String maker = manufacturer;

        System.out.println("Color: " + penColor);
        System.out.println("Type: " + penType);
        System.out.println("Manufacturer: " + maker);
    }

    public static void main(String[] args) {
        String c = "Blue";
        String t = "Ball Pen";

        Q08Pen p = new Q08Pen();
        p.color = c;
        p.type = t;

        p.display();
    }
}