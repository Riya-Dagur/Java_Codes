import java.util.Scanner;

public class Q25LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&&, ||): ");
        String operator = sc.next();

        if (operator.equals("&&"))
            System.out.println((a != 0) && (b != 0));
        else if (operator.equals("||"))
            System.out.println((a != 0) || (b != 0));
        else
            System.out.println("Invalid Logical Operator");

        sc.close();
    }
}
