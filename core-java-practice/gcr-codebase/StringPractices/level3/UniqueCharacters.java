package StringPractices.level3;

import java.util.Scanner;

public class UniqueCharacters {

    // Find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {

        int size = findLength(text);

        char[] temp = new char[size];
        int index = 0;

        for (int i = 0; i < size; i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[index] = text.charAt(i);
                index++;
            }
        }

        // Create final array
        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] ans = uniqueCharacters(text);

        System.out.println("Unique Characters:");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}