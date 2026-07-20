package BinarySearch;

public class AstronomerCatalog {
    
    // basic binary search for O(log n) performance
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // finding the minimum in a rotated array (the telescope glitch)
    public static int findMinRotated(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // if middle is greater than right, min is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // otherwise it's in the left half
                right = mid;
            }
        }
        return arr[left];
    }

    // searching for a target in a scrambled rotated array
    public static int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            
            // Check if left half is properly sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // right half is properly sorted
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] rotatedStars = {800, 950, 1000, 200, 350, 400, 500, 600};
        
        System.out.println("Astronomer's Catalog System:");
        System.out.println("Glitch Min Brightness: " + findMinRotated(rotatedStars));
        System.out.println("Index of star brightness 400: " + searchRotated(rotatedStars, 400));
    }
}
