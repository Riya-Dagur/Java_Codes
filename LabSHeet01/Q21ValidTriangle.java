import java.util.Scanner;

public class Q21ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");

        sc.close();
    }
}
