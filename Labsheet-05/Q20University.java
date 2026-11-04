
interface Researcher {
    void conductResearch();
}

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

class Teacher extends Employee implements Researcher {
    String subject;

    void teach() {
        System.out.println("Teaching subject: " + subject);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 5000;
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher conducts research.");
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    double calculateSalary() {
        return hoursWorked * 500;
    }
}

class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing department: " + department);
    }
}

public class Q20University {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setEmployeeId(101);
        t.setEmployeeName("Amit");
        t.setSalary(40000);
        t.subject = "Java";

        VisitingTeacher vt = new VisitingTeacher();
        vt.setEmployeeId(102);
        vt.setEmployeeName("Neha");
        vt.setSalary(0);
        vt.subject = "Python";
        vt.hoursWorked = 20;

        Admin a = new Admin();
        a.setEmployeeId(103);
        a.setEmployeeName("Rahul");
        a.setSalary(35000);
        a.department = "Administration";

        System.out.println("--- Teacher Details ---");
        t.displayDetails();
        t.teach();
        t.conductResearch();
        System.out.println("Calculated Salary: " +
                           t.calculateSalary());

        System.out.println("\n--- Visiting Teacher Details ---");
        vt.displayDetails();
        vt.teach();
        System.out.println("Calculated Salary: " +
                           vt.calculateSalary());

        System.out.println("\n--- Admin Details ---");
        a.displayDetails();
        a.manageDepartment();
        System.out.println("Calculated Salary: " +
                           a.calculateSalary());
    }
}
