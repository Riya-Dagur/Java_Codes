import java.util.Scanner;

public class Q06AsciiValue {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=Sc.next();
        int ascii = (int) str.charAt(0);
        System.out.println("ASCII Value of "+str+" is "+ ascii);
        Sc.close();
    }
}
