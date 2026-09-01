import java.util.Scanner;
public class Q05ExplitTypeCasting {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        float num=sc.nextFloat();
        int x = (int) num;
        System.out.print("Before Conversion: "+num );
        System.out.print(" After Conversion: "+x);
        sc.close();
}
}
