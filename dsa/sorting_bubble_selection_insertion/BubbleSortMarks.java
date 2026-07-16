package sorting;

import java.util.Arrays;

public class BubbleSortMarks {
    
    // Sorts the student marks array in ascending order using Bubble Sort
    public static void sortMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap them if they are in the wrong order
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // if we completed a pass without swapping, it's already sorted
            if (!swapped) break; 
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 65, 88};
        System.out.println("Unsorted Marks: " + Arrays.toString(marks));
        sortMarks(marks);
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
