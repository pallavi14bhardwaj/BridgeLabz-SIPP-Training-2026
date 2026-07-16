package SortingMergeQuickCounting;

import java.util.Random;

public class LibrarySortComparison {
    
    // ---------------- MERGE SORT ----------------
    // recursively splitting the array in half (the O(log n) part)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right); // doing the actual merging work
        }
    }

    // the O(n) merge step - pulling the two sorted halves back together
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // fill up our temp arrays
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];
        
        // zip them back into the main array in sorted order
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        
        // scoop up any leftovers
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // ---------------- QUICK SORT ----------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = lomutoPartition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // classic Lomuto partition: grabbing the last element as pivot
    private static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = (low - 1); 
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // throw smaller items to the left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // lock the pivot into its final spot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    // ---------------- COUNTING SORT ----------------
    // fast O(n) sort specifically for bounded ranges (like genres 1-20)
    public static void countingSort(int[] arr, int maxVal) {
        int[] count = new int[maxVal + 1];
        int[] output = new int[arr.length];
        
        // tally up occurrences
        for (int num : arr) {
            count[num]++;
        }
        
        // cumulative sums to figure out exact positioning
        for (int i = 1; i <= maxVal; i++) {
            count[i] += count[i - 1];
        }
        
        // place elements in output backwards to maintain stability
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        
        // push sorted data back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // ---------------- RUNTIME COMPARISON ----------------
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000}; // testing different scales
        Random rand = new Random();
        
        System.out.println("Empirical Runtime Comparison (in ms):");
        System.out.println("Size\tMerge\tQuick\tCounting");
        
        for (int size : sizes) {
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            int[] arr3 = new int[size]; 
            
            for (int i = 0; i < size; i++) {
                int randomYear = 1900 + rand.nextInt(124); 
                arr1[i] = randomYear;
                arr2[i] = randomYear;
                // counting sort array restricted to tight bounds
                arr3[i] = 1 + rand.nextInt(20); 
            }
            
            // test Merge
            long start = System.nanoTime();
            mergeSort(arr1, 0, size - 1);
            long timeMerge = (System.nanoTime() - start) / 1000000;
            
            // test Quick
            start = System.nanoTime();
            quickSort(arr2, 0, size - 1);
            long timeQuick = (System.nanoTime() - start) / 1000000;
            
            // test Counting
            start = System.nanoTime();
            countingSort(arr3, 20);
            long timeCounting = (System.nanoTime() - start) / 1000000;
            
            System.out.println(size + "\t" + timeMerge + "\t" + timeQuick + "\t" + timeCounting);
        }
    }
}
