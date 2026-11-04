import java.util.Scanner;
public class Q8NestedTryCatch {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;

            int result = a / b;
            System.out.println("Division: " + result);
            try {
                int arr[] = {10, 20, 30};
                System.out.println("Array Element: " + arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index.");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}