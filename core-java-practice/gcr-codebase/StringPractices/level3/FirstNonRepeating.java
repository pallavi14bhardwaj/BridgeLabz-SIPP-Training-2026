package StringPractices.level3;

import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find first non-repeating character
    public static char firstNonRepeating(String text) {

        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char ch = firstNonRepeating(text);

        if (ch == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + ch);

        sc.close();
    }
}