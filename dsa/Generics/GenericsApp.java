package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericsApp {
    public static void main(String[] args) {
        System.out.println("1. Testing Generic Pair<T, U>");
        Pair<String, Integer> personAge = new Pair<>("Alice", 28);
        Pair<Integer, Double> coordinates = new Pair<>(10, 20.5);
        System.out.println("Person: " + personAge);
        System.out.println("Coordinates: " + coordinates);

        System.out.println("\n2. Testing Generic Stack<T>");
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Java");
        stringStack.push("Generics");
        System.out.println("Stack: " + stringStack);
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Stack after pop: " + stringStack);

        System.out.println("\n3. Testing Bounded Generic Method (findMax)");
        Integer[] nums = {10, 45, 2, 89, 23};
        String[] words = {"Apple", "Zebra", "Mango"};
        System.out.println("Max Integer: " + ArrayUtils.findMax(nums));
        System.out.println("Max String: " + ArrayUtils.findMax(words));

        System.out.println("\n4. Testing Generic Repository<T>");
        Repository<String> userRepository = new Repository<>();
        userRepository.save("User_Alice");
        userRepository.save("User_Bob");
        userRepository.delete("User_Alice");

        System.out.println("\n5. Testing Wildcard List<?> Print Utility");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");
        
        // The same printList method handles both lists thanks to <?>
        PrinterUtils.printList(intList);
        PrinterUtils.printList(strList);
    }
}
