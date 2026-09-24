package LabSheet04;

public class Q22Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        int original = number;
        int temp = number;
        int sum = 0;
        int digit;

        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        int number = 153;

        Q22Armstrong a = new Q22Armstrong();
        a.checkArmstrong(number);

        System.out.println("Total Checks: " + totalChecks);
    }
}
