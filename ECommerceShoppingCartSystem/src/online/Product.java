public class Product {
    int productId;
    String name;
    double price;
    int stockQuantity;

    public void getDetails() {
        System.out.println(name + " - Rs." + price);
    }

    public boolean checkAvailability() {
        return stockQuantity > 0;
    }
}
