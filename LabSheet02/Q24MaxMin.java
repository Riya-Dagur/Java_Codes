package LabSheet02;
import java.util.Scanner;

public class Q24MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        sc.close();
    }
}
