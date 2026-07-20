package SortingMergeQuickCounting;

public class MergeSortOrders {

    public static void mergeSort(int[] orders, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(orders, left, mid);
            mergeSort(orders, mid + 1, right);
            merge(orders, left, mid, right);
        }
    }

    private static void merge(int[] orders, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++) L[i] = orders[left + i];
        for (int j = 0; j < n2; j++) R[j] = orders[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                orders[k++] = L[i++];
            } else {
                orders[k++] = R[j++];
            }
        }
        
        while (i < n1) orders[k++] = L[i++];
        while (j < n2) orders[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] orders = {850, 420, 1200, 650, 300};
        
        mergeSort(orders, 0, orders.length - 1);
        
        for (int order : orders) {
            System.out.print(order + " ");
        }
        System.out.println();
    }
}
