package Practice_B_Labsheet04;

/**
 * Program 2: Student
 * Demonstrates instance variables.
 */
public class Student {

    // Instance variables belong to each Student object.
    String name;
    int rollNo;
    double marks;

    public static void main(String[] args) {

        // Create a Student object.
        Student s1 = new Student();

        // Give values to the instance variables of s1.
        s1.name = "Riya";
        s1.rollNo = 46;
        s1.marks = 95.5;

        // Display the student's information.
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
    }
}
