package StringPractices.level2;

import java.util.Scanner;

class TextSplitter {

    // finding length without length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);

        // first count how many words are there
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // store the space indexes so we know where each word ends
        int[] spaceIndexes = new int[wordCount - 1];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[j] = i;
                j++;
            }
        }

        // now extract each word using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            String word = "";
            for (int k = start; k < spaceIndexes[i]; k++) {
                word = word + text.charAt(k);
            }
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }

        // last word after the final space
        String lastWord = "";
        for (int k = start; k < len; k++) {
            lastWord = lastWord + text.charAt(k);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    // comparing two string arrays element by element
    public static boolean compareStringArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] myWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("My method words:");
        for (String w : myWords) {
            System.out.print(w + " | ");
        }

        System.out.println("\nsplit() words:");
        for (String w : builtInWords) {
            System.out.print(w + " | ");
        }

        System.out.println("\nBoth arrays match? " + compareStringArrays(myWords, builtInWords));
    }
}