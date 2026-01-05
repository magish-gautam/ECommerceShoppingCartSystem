import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

public class Main {
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Product> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Smartphone", 499.99));
        products.add(new Product(3, "Headphones", 79.99));
        products.add(new Product(4, "Smartwatch", 199.99));

        while (true) {
            System.out.println("\n===== eCommerce System =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: viewProducts(); break;
                case 2: addToCart(); break;
                case 3: viewCart(); break;
                case 4: checkout(); break;
                case 5:
                    System.out.println("Exiting... Thank you for shopping!");
                    System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void viewProducts() {
        System.out.println("\n--- Product List ---");
        for (Product p : products) System.out.println(p);
    }

    static void addToCart() {
        System.out.print("Enter Product ID to add: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product selected = null;
        for (Product p : products) if (p.id == id) selected = p;
        if (selected != null) {
            cart.add(selected);
            System.out.println(selected.name + " added to cart!");
        } else System.out.println("Product not found!");
    }

    static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        double total = 0;
        System.out.println("\n--- Your Cart ---");
        for (Product p : cart) {
            System.out.println(p);
            total += p.price;
        }
        System.out.p
