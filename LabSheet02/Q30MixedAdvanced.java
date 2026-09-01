package LabSheet02;
import java.util.Scanner;

public class Q30MixedAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if a number is a power of 4 using shift operators
        boolean powerOf4 = false;
        int temp = num;

        while (temp > 1) {
            if ((temp & 1) != 0) {
                break;
            }
            temp >>= 1;
        }

        if (temp == 1) {
            int check = num;
            int shifts = 0;

            while (check > 1) {
                check >>= 1;
                shifts++;
            }

            powerOf4 = (shifts % 2 == 0);
        }

        if (powerOf4)
            System.out.println(num + " is a power of 4.");
        else
            System.out.println(num + " is not a power of 4.");

        // using bitwise Toggle the 3rd bit of that number
        int toggled = num ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {

            int result = num * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(num + " x " + i + " = " + result);
        }

        sc.close();
    }
}
