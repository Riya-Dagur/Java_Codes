package LabSheet04;

public class Q19Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        int productId = 101;
        String productName = "Laptop";
        double productPrice = 50000;

        Q19Product p = new Q19Product();
        p.id = productId;
        p.name = productName;
        p.price = productPrice;

        p.calculatePrice();
    }
}
