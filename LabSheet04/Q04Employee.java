package LabSheet04;

public class Q04Employee {
    int empId;
    double salary;
    static String companyName = "ABC Technologies";

    void display() {
        int id = empId;
        double empSalary = salary;
        String company = companyName;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + empSalary);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        int id = 101;
        double salary = 45000;

        Q04Employee e = new Q04Employee();
        e.empId = id;
        e.salary = salary;

        e.display();
    }
}
