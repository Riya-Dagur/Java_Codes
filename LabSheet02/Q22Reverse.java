package LabSheet02;
import java.util.Scanner;

public class Q22Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (num < 0)
            reverse = -reverse;

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}
