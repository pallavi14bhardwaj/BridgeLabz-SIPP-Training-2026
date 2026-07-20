package sorting;

import java.util.Arrays;

public class SportsMeet {
    
    // Bubble Sort tracking swaps and checking for already sorted case
    public static void bubbleSort(int[] scores) {
        int n = scores.length;
        int swaps = 0;
        boolean swapped;
        
        System.out.println("--- Bubble Sort Trace ---");
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    // swap elements if they are in the wrong order
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swapped = true;
                    swaps++;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(scores));
            
            // If we didn't swap anything in a pass, the array is already sorted!
            if (!swapped) {
                System.out.println("Array sorted early on pass " + (i + 1));
                break;
            }
        }
        System.out.println("Total Bubble Sort Swaps: " + swaps);
    }

    // Insertion Sort 
    public static void insertionSort(int[] scores) {
        int n = scores.length;
        System.out.println("\n--- Insertion Sort Trace ---");
        for (int i = 1; i < n; i++) {
            int key = scores[i];
            int j = i - 1;
            
            // shift elements that are greater than the key to the right
            while (j >= 0 && scores[j] > key) {
                scores[j + 1] = scores[j];
                j = j - 1;
            }
            scores[j + 1] = key;
            System.out.println("Pass " + i + ": " + Arrays.toString(scores));
        }
    }

    // Find the top 3 medalists (the 3 highest scores at the end of the array)
    public static void findTopMedalists(int[] sortedScores) {
        System.out.println("\n--- Top 3 Medalists ---");
        int n = sortedScores.length;
        if (n >= 3) {
            System.out.println("Gold: " + sortedScores[n - 1]);
            System.out.println("Silver: " + sortedScores[n - 2]);
            System.out.println("Bronze: " + sortedScores[n - 3]);
        } else {
            System.out.println("Not enough athletes for 3 medals.");
        }
    }

    public static void main(String[] args) {
        // The array requested in the problem trace
        int[] scoresBubble = {64, 25, 12, 22, 11};
        int[] scoresInsertion = {64, 25, 12, 22, 11}; // duplicate array to trace insertion sort cleanly
        
        System.out.println("Original Array: " + Arrays.toString(scoresBubble));
        
        bubbleSort(scoresBubble);
        insertionSort(scoresInsertion);
        
        findTopMedalists(scoresBubble);
    }
}
