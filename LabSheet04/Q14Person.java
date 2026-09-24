package LabSheet04;

public class Q14Person {
    String name;
    int age;
    static String country = "India";

    void checkEligibility() {
        int personAge = age;
        boolean eligible = personAge >= 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        String n = "Riya";
        int a = 20;

        Q14Person p = new Q14Person();
        p.name = n;
        p.age = a;

        p.checkEligibility();
    }
}
