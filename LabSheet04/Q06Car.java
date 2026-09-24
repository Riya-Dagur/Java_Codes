package LabSheet04;

public class Q06Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        String carBrand = brand;
        double carMileage = mileage;
        int carWheels = wheels;

        System.out.println("Brand: " + carBrand);
        System.out.println("Mileage: " + carMileage + " km/l");
        System.out.println("Wheels: " + carWheels);
    }

    public static void main(String[] args) {
        String b = "Toyota";
        double m = 18.5;

        Q06Car c = new Q06Car();
        c.brand = b;
        c.mileage = m;

        c.display();
    }
}
