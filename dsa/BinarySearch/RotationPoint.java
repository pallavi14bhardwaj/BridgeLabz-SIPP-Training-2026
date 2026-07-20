package BinarySearch;

public class RotationPoint {

    // find the smallest element index, which acts as our rotation point
    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the rightmost, smallest is to the right
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // smallest is to the left (or is mid itself)
                right = mid;
            }
        }
        
        // left equals right when we pinpoint it
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int rotationIndex = findRotationIndex(arr);
        
        System.out.println("Rotation point index is: " + rotationIndex);
        System.out.println("Smallest element is: " + arr[rotationIndex]);
    }
}
