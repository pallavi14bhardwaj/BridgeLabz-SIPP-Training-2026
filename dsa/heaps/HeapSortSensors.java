package dsa.heaps;

public class HeapSortSensors {

    // Sorts the array in place in O(n log n) time with O(1) space.
    public void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max-heap. 
        // We need a max-heap because we want the largest elements at the end of the array.
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMax(arr, i, n);
        }

        // Step 2: Swap the max element (at root) with the last element of the heap,
        // then shrink the heap size by 1 and sift down the new root.
        for (int end = n - 1; end > 0; end--) {
            // Move current max to the end
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            // Sift down the new root to maintain max-heap property for the remaining heap
            siftDownMax(arr, 0, end);
        }
    }

    // Standard sift-down for a max-heap
    private void siftDownMax(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            siftDownMax(arr, largest, size);
        }
    }
}
