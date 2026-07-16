package sorting;

import java.util.Arrays;

public class InsertionSortIDs {
    
    // Sorts the employee IDs array in ascending order using Insertion Sort
    public static void sortIDs(int[] ids) {
        int n = ids.length;
        
        // start from the second element assuming the first is sorted
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            
            // pick an element from unsorted part and insert it into its correct position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            // place the key at its correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] empIds = {105, 102, 104, 101, 103};
        System.out.println("Unsorted Employee IDs: " + Arrays.toString(empIds));
        sortIDs(empIds);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(empIds));
    }
}
