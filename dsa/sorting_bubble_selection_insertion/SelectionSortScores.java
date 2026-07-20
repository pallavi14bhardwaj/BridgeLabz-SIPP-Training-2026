package sorting;

import java.util.Arrays;

public class SelectionSortScores {
    
    // Sorts the exam scores array in ascending order using Selection Sort
    public static void sortScores(int[] scores) {
        int n = scores.length;
        
        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            
            // swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {45, 90, 32, 75, 50};
        System.out.println("Unsorted Exam Scores: " + Arrays.toString(scores));
        sortScores(scores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }
}
