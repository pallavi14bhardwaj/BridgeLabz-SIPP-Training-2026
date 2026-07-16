package Generics;

public class ArrayUtils {
    
    // Generic method bounded to Comparable to find the maximum element in an array.
    // T must implement Comparable to ensure we can compare the elements.
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // or throw an exception
        }
        
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // compareTo returns a positive number if arr[i] is greater than max
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
