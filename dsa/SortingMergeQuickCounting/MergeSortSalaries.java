package SortingMergeQuickCounting;

public class MergeSortSalaries {

    public static void mergeSort(int[] salaries, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(salaries, left, mid);
            mergeSort(salaries, mid + 1, right);
            merge(salaries, left, mid, right);
        }
    }

    private static void merge(int[] salaries, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) L[i] = salaries[left + i];
        for (int j = 0; j < n2; j++) R[j] = salaries[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            // comparing and placing the smaller salary first
            if (L[i] <= R[j]) {
                salaries[k++] = L[i++];
            } else {
                salaries[k++] = R[j++];
            }
        }
        
        // drain remaining elements
        while (i < n1) salaries[k++] = L[i++];
        while (j < n2) salaries[k++] = R[j++];
    }

    public static void main(String[] args) {
        // hardcoding the test input to run it quickly
        int[] salaries = {45000, 32000, 78000, 55000, 40000, 60000};
        
        mergeSort(salaries, 0, salaries.length - 1);
        
        // print out the sorted array
        for (int s : salaries) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
