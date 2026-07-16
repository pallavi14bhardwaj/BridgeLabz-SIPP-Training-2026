package BinarySearch;

public class MatrixSearch {

    // treats the 2D matrix like a flat 1D array for binary search
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = rows * cols - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // mapping 1D index back to 2D coordinates
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                // target is larger, search right half
                left = mid + 1;
            } else {
                // target is smaller, search left half
                right = mid - 1;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target = 3;
        System.out.println("Is " + target + " in the matrix? " + searchMatrix(matrix, target));
        
        target = 13;
        System.out.println("Is " + target + " in the matrix? " + searchMatrix(matrix, target));
    }
}
