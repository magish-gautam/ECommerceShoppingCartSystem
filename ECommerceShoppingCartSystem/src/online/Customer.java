public class Customer {
    int customerId;
    String name;
    String email;
    String password;

    public void register() {
        System.out.println("Registered successfully");
    }

    public void login() {
        System.out.println("Logged in");
    }

    public void addToCart(Product p, ShoppingCart cart) {
        cart.addProduct(p);
    }

    public void checkout(ShoppingCart cart) {
        cart.calculateTotalPrice();
        System.out.println("Checkout complete");
    }
}
