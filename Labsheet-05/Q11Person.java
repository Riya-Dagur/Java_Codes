
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println(name + " is studying " + course);
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

public class Q11Person {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Nikita";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Priya";
        t.subject = "Java";

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}
