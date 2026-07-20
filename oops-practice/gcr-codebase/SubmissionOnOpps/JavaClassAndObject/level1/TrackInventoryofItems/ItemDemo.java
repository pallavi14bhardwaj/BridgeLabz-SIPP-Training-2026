package oppsPracticeProblem.JavaClassAndObject.level1.TrackInventoryofItems;
public class ItemDemo {
    public static void main(String[] args) {
        Item item = new Item();

        item.itemCode = 1001;
        item.itemName = "Pen";
        item.price = 20;

        item.displayDetails();

        int quantity = 5;
        System.out.println("Total Cost = " +
                item.calculateTotalCost(quantity));
    }
}