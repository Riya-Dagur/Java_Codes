package LabSheet04;

public class Q23PrimeChecker {
    static int totalPrimeChecks = 0;

    void checkPrime(int number) {
        boolean prime = true;
        int divisor;

        if (number <= 1) {
            prime = false;
        } else {
            for (divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }

    public static void main(String[] args) {
        int number = 29;

        Q23PrimeChecker p = new Q23PrimeChecker();
        p.checkPrime(number);

        System.out.println("Total Checks: " + totalPrimeChecks);
    }
}
