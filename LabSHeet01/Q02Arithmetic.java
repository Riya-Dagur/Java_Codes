import java.util.Scanner;
public class Q02Arithmetic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=obj.nextInt();
        System.out.print("Enter Second number: ");
        int b=obj.nextInt();
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(b/a));
        obj.close();
    }
}
