package LabSheet04;

public class Q17StudentGrade {
    String name;
    double marks;
    static double passingMarks = 40;

    void calculateGrade() {
        double studentMarks = marks;
        String grade;

        if (studentMarks >= 90) {
            grade = "A";
        } else if (studentMarks >= 75) {
            grade = "B";
        } else if (studentMarks >= 60) {
            grade = "C";
        } else if (studentMarks >= passingMarks) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Name: " + name);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        String n = "Riya";
        double m = 82;

        Q17StudentGrade s = new Q17StudentGrade();
        s.name = n;
        s.marks = m;

        s.calculateGrade();
    }
}
