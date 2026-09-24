package LabSheet04;

public class Q11Calculator {
    static int operationsCount = 0;

    int add(int a, int b) {
        int result = a + b;
        operationsCount++;
        return result;
    }

    int subtract(int a, int b) {
        int result = a - b;
        operationsCount++;
        return result;
    }

    int multiply(int a, int b) {
        int result = a * b;
        operationsCount++;
        return result;
    }

    double divide(double a, double b) {
        double result = a / b;
        operationsCount++;
        return result;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        Q11Calculator c = new Q11Calculator();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtract(a, b));
        System.out.println("Multiplication: " + c.multiply(a, b));
        System.out.println("Division: " + c.divide(a, b));
        System.out.println("Operations: " + operationsCount);
    }
}
