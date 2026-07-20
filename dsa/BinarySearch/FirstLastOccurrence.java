package BinarySearch;

import java.util.Arrays;

public class FirstLastOccurrence {

    // find first and last occurrence wrapper
    public static int[] findOccurrences(int[] arr, int target) {
        int first = findBound(arr, target, true);
        
        // if it doesn't exist at all, return [-1, -1] immediately
        if (first == -1) {
            return new int[]{-1, -1};
        }
        
        int last = findBound(arr, target, false);
        return new int[]{first, last};
    }
    
    // generalized bound finder to keep code DRY
    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid; // record this position
                if (isFirst) {
                    // keep looking left for earlier occurrences
                    right = mid - 1;
                } else {
                    // keep looking right for later occurrences
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] result = findOccurrences(arr, target);
        System.out.println("Target " + target + " occurrences: " + Arrays.toString(result));
    }
}
