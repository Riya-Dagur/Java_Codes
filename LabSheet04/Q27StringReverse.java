package LabSheet04;

public class Q27StringReverse {
    static int totalReversals = 0;

    void reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        totalReversals++;

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }

    public static void main(String[] args) {
        String text = "Java";

        Q27StringReverse s = new Q27StringReverse();
        s.reverseString(text);

        System.out.println("Total Reversals: " + totalReversals);
    }
}
