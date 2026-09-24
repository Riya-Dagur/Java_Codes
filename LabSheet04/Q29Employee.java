package LabSheet04;

public class Q29Employee {
    String name;
    double salary;
    static String organization = "ABC Technologies";

    void compareSalary(Q29Employee other) {
        String employee1 = name;
        String employee2 = other.name;
        double salary1 = salary;
        double salary2 = other.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2) {
            System.out.println(employee1 + " has a higher salary.");
        } else if (salary2 > salary1) {
            System.out.println(employee2 + " has a higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }

    public static void main(String[] args) {
        String name1 = "Riya";
        double salary1 = 50000;

        String name2 = "Anjali";
        double salary2 = 45000;

        Q29Employee e1 = new Q29Employee();
        Q29Employee e2 = new Q29Employee();

        e1.name = name1;
        e1.salary = salary1;

        e2.name = name2;
        e2.salary = salary2;

        e1.compareSalary(e2);
    }
}
