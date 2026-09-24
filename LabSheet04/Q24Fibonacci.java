package LabSheet04;

public class Q24Fibonacci {
    static int seriesCount = 0;

    void displaySeries(int n) {
        int first = 0;
        int second = 1;
        int next;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
    }

    public static void main(String[] args) {
        int terms = 8;

        Q24Fibonacci f = new Q24Fibonacci();
        f.displaySeries(terms);

        System.out.println();
        System.out.println("Series Count: " + seriesCount);
    }
}