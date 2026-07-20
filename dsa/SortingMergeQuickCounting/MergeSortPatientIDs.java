package SortingMergeQuickCounting;

public class MergeSortPatientIDs {

    public static void mergeSort(int[] ids, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(ids, left, mid);
            mergeSort(ids, mid + 1, right);
            merge(ids, left, mid, right); // standard O(n) merge step
        }
    }

    private static void merge(int[] ids, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) L[i] = ids[left + i];
        for (int j = 0; j < n2; j++) R[j] = ids[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                ids[k++] = L[i++];
            } else {
                ids[k++] = R[j++];
            }
        }
        
        while (i < n1) ids[k++] = L[i++];
        while (j < n2) ids[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] ids = {105, 101, 108, 102, 104};
        
        mergeSort(ids, 0, ids.length - 1);
        
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
