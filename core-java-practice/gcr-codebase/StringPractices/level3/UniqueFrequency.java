package StringPractices.level3;

import java.util.Scanner;

public class UniqueFrequency {

    // Find unique characters
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count] = text.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    // Find frequency
    public static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] ans = frequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }

        sc.close();
    }
}