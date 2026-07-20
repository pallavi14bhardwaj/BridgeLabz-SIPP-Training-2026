package oppsPracticeProblem.JavaClassAndObject.level2.SimulateShoppingCart;
public class CartItemDemo {
    public static void main(String[] args) {
        CartItem item = new CartItem();

        item.addItem("Laptop", 50000, 2);

        item.displayTotalCost();

        item.removeItem();

        item.displayTotalCost();
    }
}