package LabSheet02;
import java.util.Scanner;

public class Q25AverageMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][3];

        System.out.println("Enter marks of 3 students in 3 subjects:");

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                sum += mark;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average marks = " + average);

        sc.close();
    }
}