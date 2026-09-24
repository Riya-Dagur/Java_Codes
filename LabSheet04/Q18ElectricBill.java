package LabSheet04;

public class Q18ElectricBill {
    double units;
    static double fixedCharge = 50;

    void calculateBill() {
        double rate = 5;
        double energyCharge = units * rate;
        double totalBill = fixedCharge + energyCharge;

        System.out.println("Units: " + units);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        double u = 100;

        Q18ElectricBill e = new Q18ElectricBill();
        e.units = u;

        e.calculateBill();
    }
}
