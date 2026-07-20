package BinarySearch;

public class PeakElement {

    // finding any peak element in the array using binary search
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // if we are on a downward slope, peak is to the left
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                // we are on an upward slope, peak must be to the right
                left = mid + 1;
            }
        }
        // left and right converge precisely on a peak
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("A peak element is: " + arr[peakIndex] + " at index " + peakIndex);
    }
}
