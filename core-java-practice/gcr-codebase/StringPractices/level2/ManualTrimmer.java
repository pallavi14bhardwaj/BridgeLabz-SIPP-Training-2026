package StringPractices.level2;

import java.util.Scanner;

class ManualTrimmer {

    // finding start and end points where actual text begins and ends
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        // moving start forward until non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        // moving end backward until non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    public static String getSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] trimPoints = findTrimPoints(text);
        String myTrimmed = getSubstring(text, trimPoints[0], trimPoints[1]);
        String builtInTrimmed = text.trim();

        System.out.println("My trimmed result:  '" + myTrimmed + "'");
        System.out.println("trim() result:      '" + builtInTrimmed + "'");
        System.out.println("Both match? " + compareStrings(myTrimmed, builtInTrimmed));
    }
}