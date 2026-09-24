package LabSheet04;

public class Q15SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "State Bank";

    void calculateInterest() {
        double p = principal;
        double r = rate;
        double t = time;

        double interest = (p * r * t) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        double p = 10000;
        double r = 5;
        double t = 2;

        Q15SimpleInterest s = new Q15SimpleInterest();
        s.principal = p;
        s.rate = r;
        s.time = t;

        s.calculateInterest();
    }
}
