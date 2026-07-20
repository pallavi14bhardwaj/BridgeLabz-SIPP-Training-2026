package StringPractices.level3;

import java.util.Scanner;

public class NestedLoopFrequency {

    // Method to find frequency
    public static String[] frequency(String text) {

        char[] ch = text.toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {

            freq[i] = 1;

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        String[] result = new String[ch.length];

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != '0')
                result[i] = ch[i] + " : " + freq[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] ans = frequency(text);

        System.out.println("Character Frequencies");

        for (int i = 0; i < ans.length; i++) {

            if (ans[i] != null)
                System.out.println(ans[i]);
        }

        sc.close();
    }
}