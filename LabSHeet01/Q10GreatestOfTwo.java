import java.util.Scanner;

public class Q10GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greatest number: " + a);
        else
            System.out.println("Greatest number: " + b);

        sc.close();
    }
}
