package Generics.warehouse;

import java.util.ArrayList;
import java.util.List;

// Bounded generic class: T must be a WarehouseItem or a subclass of it
public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void store(T item) {
        items.add(item);
        System.out.println("Stored: " + item.getName());
    }

    public List<T> getItems() {
        return items;
    }
    
    // Wildcard method to display all items regardless of their specific subtype
    public static void displayItems(List<? extends WarehouseItem> list) {
        System.out.println("--- Storage Contents ---");
        for (WarehouseItem item : list) {
            System.out.println(" - " + item.getName() + " (" + item.getClass().getSimpleName() + ")");
        }
        System.out.println("------------------------\n");
    }
}
