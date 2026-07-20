package StringPractices.level1;

import java.util.Scanner;

class SubstringFinder {

    // building substring manually using charAt
    public static String getSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // reusing compare logic from earlier
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String mySubstring = getSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("My substring: " + mySubstring);
        System.out.println("substring() result: " + builtInSubstring);

        // verifying both substrings are same
        boolean same = compareStrings(mySubstring, builtInSubstring);
        System.out.println("Are they equal? " + same);
    }
}