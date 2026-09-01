package LabSheet02;

import java.util.Scanner;

public class Q05NegativeUsingUnary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int negative = -num;

        System.out.println("Negative value = " + negative);

        sc.close();
    }
}
