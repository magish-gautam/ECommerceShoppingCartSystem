import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> cartItems = new ArrayList<>();
    double totalPrice;

    public void addProduct(Product p) {
        cartItems.add(p);
        totalPrice += p.price;
    }

    public void removeProduct(Product p) {
        cartItems.remove(p);
        totalPrice -= p.price;
    }

    public void calculateTotalPrice() {
        System.out.println("Total: Rs." + totalPrice);
    }
}
