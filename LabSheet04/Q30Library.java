package LabSheet04;

public class Q30Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    void issueBook() {
        int available = booksAvailable;

        if (available > 0) {
            available--;
            booksAvailable = available;
            System.out.println("Book Issued");
        } else {
            System.out.println("No Books Available");
        }
    }

    void returnBook() {
        int available = booksAvailable;
        available++;
        booksAvailable = available;

        System.out.println("Book Returned");
    }

    void display() {
        int available = booksAvailable;

        System.out.println("Library: " + libraryName);
        System.out.println("Books Available: " + available);
    }

    public static void main(String[] args) {
        int books = 10;

        Q30Library l = new Q30Library();
        l.booksAvailable = books;

        l.display();
        l.issueBook();
        l.display();
        l.returnBook();
        l.display();
    }
}
