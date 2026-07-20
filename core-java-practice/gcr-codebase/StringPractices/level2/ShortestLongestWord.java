package StringPractices.level2;

import java.util.Scanner;

class ShortestLongestWord {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceIndexes[j++] = i;
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            String word = "";
            for (int k = start; k < spaceIndexes[i]; k++) word = word + text.charAt(k);
            words[i] = word;
            start = spaceIndexes[i] + 1;
        }
        String lastWord = "";
        for (int k = start; k < len; k++) lastWord = lastWord + text.charAt(k);
        words[wordCount - 1] = lastWord;
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // traversing 2D array to find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < wordLengths.length; i++) {
            int currentLen = Integer.parseInt(wordLengths[i][1]);
            if (currentLen < Integer.parseInt(wordLengths[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (currentLen > Integer.parseInt(wordLengths[longestIndex][1])) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordLengths(words);
        int[] result = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[result[0]][0] +
                " (length: " + wordLengths[result[0]][1] + ")");
        System.out.println("Longest word:  " + wordLengths[result[1]][0] +
                " (length: " + wordLengths[result[1]][1] + ")");
    }
}