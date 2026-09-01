package LabSheet02;
import java.util.Scanner;

public class Q13CharacterCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = Character.isDigit(ch)
                ? "Digit"
                : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')
                ? ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    ? "Vowel" : "Consonant")
                : "Special Symbol");

        System.out.println(result);

        sc.close();
    }
}