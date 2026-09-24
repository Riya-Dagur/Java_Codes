package Practice_B_Labsheet04;

/**
 * Program 3: University
 * Demonstrates a static class-level variable.
 */
public class University {

    // static means one shared copy belongs to the class.
    static String universityName = "ABC University";

    public static void main(String[] args) {

        /*
         * The static variable can be accessed directly
         * from this static main method.
         */
        System.out.println("University: " + universityName);
    }
}