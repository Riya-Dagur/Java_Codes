package LabSheet04;

public class Q05Book {
    String title;
    String author;
    double price;
    static String publisher = "Penguin";

    void display() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        String t = "Java Programming";
        String a = "James Gosling";
        double p = 599;

        Q05Book b = new Q05Book();
        b.title = t;
        b.author = a;
        b.price = p;

        b.display();
    }
}
