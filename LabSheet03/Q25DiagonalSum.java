package LabSheet03;
import java.util.Scanner;

public class Q25DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter elements of 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            mainDiagonal = mainDiagonal + matrix[i][i];
            secondaryDiagonal = secondaryDiagonal + matrix[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + mainDiagonal);
        System.out.println("Secondary diagonal sum = " + secondaryDiagonal);
    }
}
