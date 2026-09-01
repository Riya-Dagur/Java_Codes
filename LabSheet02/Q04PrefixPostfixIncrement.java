package LabSheet02;

import java.util.Scanner;

public class Q04PrefixPostfixIncrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Visitors entering: " + (++visitors));
        System.out.println("Visitors entering: " + (visitors++));
        System.out.println("Visitors leaving: " + (visitors--));
        System.out.println("Visitors entering: " + (--visitors));
        System.out.println("Visitors remaining: " + visitors);

        sc.close();
    }
}