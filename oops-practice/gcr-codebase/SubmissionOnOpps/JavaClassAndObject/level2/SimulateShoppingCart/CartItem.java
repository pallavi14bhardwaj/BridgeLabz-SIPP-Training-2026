package oppsPracticeProblem.JavaClassAndObject.level2.SimulateShoppingCart;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " +
                (price * quantity));
    }
}