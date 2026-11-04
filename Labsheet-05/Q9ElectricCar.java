
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }

    void stop() {
        System.out.println("Vehicle stops.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }
}

public class Q9ElectricCar {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
        e.stop();
    }
}
