package Generics.warehouse;

public class WarehouseApp {
    public static void main(String[] args) {
        // Creating type-safe storages for different categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.store(new Electronics("Laptop"));
        electronicsStorage.store(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.store(new Groceries("Apples"));
        groceriesStorage.store(new Groceries("Milk"));

        System.out.println();

        // Using the wildcard method to display items from different generic lists
        Storage.displayItems(electronicsStorage.getItems());
        Storage.displayItems(groceriesStorage.getItems());
    }
}
