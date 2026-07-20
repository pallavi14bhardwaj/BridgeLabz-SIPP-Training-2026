package Generics;

import java.util.List;

public class PrinterUtils {
    
    // Demonstrating the use of the wildcard <?> for a utility print method.
    // This method accepts a List of ANY type. Since we are only reading (not modifying),
    // the unbounded wildcard is safe and prevents type mismatch errors.
    public static void printList(List<?> list) {
        System.out.println("Printing list items:");
        for (Object item : list) {
            System.out.println(" - " + item);
        }
    }
}
