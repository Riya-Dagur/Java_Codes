package LabSheet04;

public class Q25Factorial {
    static int totalCalls = 0;

    void calculateFactorial(int number) {
        long factorial = 1;
        int i;

        for (i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {
        int number = 5;

        Q25Factorial f = new Q25Factorial();
        f.calculateFactorial(number);

        System.out.println("Total Calls: " + totalCalls);
    }
}
