package LabSheet04;

public class Q01Student {
    String name;
    int age;
    static int count = 0;

    Q01Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        String name1 = "Riya";
        int age1 = 20;

        String name2 = "Anjali";
        int age2 = 21;

        Q01Student s1 = new Q01Student(name1, age1);
        Q01Student s2 = new Q01Student(name2, age2);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}
