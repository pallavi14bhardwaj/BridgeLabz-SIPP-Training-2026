package Generics;

import java.util.ArrayList;
import java.util.List;

// A generic repository for storing and managing any entity type.
// This is a common pattern in enterprise applications (e.g., storing Users, Products, etc.)
public class Repository<T> {
    private List<T> database = new ArrayList<>();

    public void save(T entity) {
        database.add(entity);
        System.out.println("Saved entity: " + entity);
    }

    public void delete(T entity) {
        if (database.remove(entity)) {
            System.out.println("Deleted entity: " + entity);
        } else {
            System.out.println("Entity not found to delete.");
        }
    }

    public List<T> findAll() {
        return new ArrayList<>(database); // return a copy for safety
    }
}
