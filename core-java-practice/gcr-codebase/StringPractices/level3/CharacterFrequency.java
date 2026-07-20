package StringPractices.level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (freq[ch] != 0) {

                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);

                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] ans = findFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < ans.length; i++) {

            if (ans[i][0] != null)
                System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }

        sc.close();
    }
}