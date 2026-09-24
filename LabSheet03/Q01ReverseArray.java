package LabSheet03;
import java.util.Scanner;

public class Q01ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 integers:");

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Entered Array is:");

        for(int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

        System.out.println();

        sc.close();
    }
}
