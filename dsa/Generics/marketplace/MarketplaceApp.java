package Generics.marketplace;

public class MarketplaceApp {
    public static void main(String[] args) {
        // Creating products with specific category bindings
        Product<BookCategory> book = new Product<>("Java Generics Fundamentals", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Graphic T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone X", 800.0, new GadgetCategory());

        System.out.println("--- Before Discounts ---");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        System.out.println("\n--- Applying Discounts ---");
        // Using the generic utility method to apply discounts across all types
        DiscountUtils.applyDiscount(book, 10.0);
        DiscountUtils.applyDiscount(shirt, 25.0);
        DiscountUtils.applyDiscount(phone, 5.0);
    }
}
