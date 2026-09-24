package LabSheet04;

public class Q12StudentMarks {
    double marks1;
    double marks2;
    double marks3;
    static String universityName = "COER University";

    void displayAverage() {
        double total = marks1 + marks2 + marks3;
        double average = total / 3;

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        double m1 = 80;
        double m2 = 75;
        double m3 = 85;

        Q12StudentMarks s = new Q12StudentMarks();
        s.marks1 = m1;
        s.marks2 = m2;
        s.marks3 = m3;

        s.displayAverage();
    }
}
