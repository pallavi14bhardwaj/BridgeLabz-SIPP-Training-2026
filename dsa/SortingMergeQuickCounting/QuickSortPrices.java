package SortingMergeQuickCounting;

public class QuickSortPrices {

    // Quick Sort for flight ticket prices
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // slice the array around a pivot
            int pi = partition(prices, low, high);
            
            // recursively sort both chunks
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    // classic Lomuto partition pattern
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // using the last element as our pivot
        int i = low - 1; 
        
        for (int j = low; j < high; j++) {
            // throw smaller prices to the left side of our boundary
            if (prices[j] <= pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        
        // lock the pivot into its final resting spot
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        
        return i + 1; 
    }

    public static void main(String[] args) {
        int[] prices = {4500, 2200, 3800, 1800, 5200};
        
        quickSort(prices, 0, prices.length - 1);
        
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
