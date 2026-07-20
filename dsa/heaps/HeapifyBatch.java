package dsa.heaps;

public class HeapifyBatch {

    // Builds a min-heap in place in O(n) time instead of O(n log n).
    // It works bottom-up, skipping the leaf nodes since they are trivially heaps already.
    public void buildHeap(int[] priorities) {
        int n = priorities.length;
        // Start from the last non-leaf node and work our way up to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    // Helper to sift down an element to its correct position to maintain the min-heap property
    private void siftDown(int[] arr, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if the left child is smaller than the current node
        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Check if the right child is smaller than the smallest found so far
        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If the smallest is not the current node, we need to swap and keep sifting down
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            
            // Recursively sift down the swapped node
            siftDown(arr, smallest, size);
        }
    }
}
