package LabSheet02;
import java.util.Random;

public class Q29RandomBreak {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int num = random.nextInt(100) + 1;

            System.out.println("Generated: " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found.");
                break;
            }
        }
    }
}
