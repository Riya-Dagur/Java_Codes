package LabSheet04;

public class Q09Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        String laptopBrand = brand;
        int laptopRAM = RAM;
        String operatingSystem = os;

        System.out.println("Brand: " + laptopBrand);
        System.out.println("RAM: " + laptopRAM + " GB");
        System.out.println("OS: " + operatingSystem);
    }

    public static void main(String[] args) {
        String b = "HP";
        int r = 8;

        Q09Laptop l = new Q09Laptop();
        l.brand = b;
        l.RAM = r;

        l.display();
    }
}
