package Generics.marketplace;

public class DiscountUtils {
    
    // Generic method to apply discounts dynamically.
    // It accepts any Product type (<T extends Product<?>>) to handle multiple categories easily.
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double currentPrice = product.getPrice();
        // Calculate the new price based on the discount percentage
        double newPrice = currentPrice - (currentPrice * (percentage / 100));
        product.setPrice(newPrice);
        
        System.out.println("Applied " + percentage + "% discount to " + product.getCategory().getCategoryName() + " item: " + product);
    }
}
