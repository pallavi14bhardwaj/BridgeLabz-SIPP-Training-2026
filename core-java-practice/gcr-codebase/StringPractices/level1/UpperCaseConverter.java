package StringPractices.level1;

import java.util.Scanner;

class UpperCaseConverter {

    // converting lowercase to uppercase using ASCII difference of 32
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // if character is lowercase letter, subtract 32 to get uppercase
            if (ch >= 97 && ch <= 122) {
                result = result + (char)(ch - 32);
            } else {
                // not a lowercase letter, keep it as it is
                result = result + ch;
            }
        }
        return result;
    }

    // comparing two strings character by character
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

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String myUpperCase = convertToUpperCase(text);
        String builtInUpperCase = text.toUpperCase();

        System.out.println("My method result:      " + myUpperCase);
        System.out.println("toUpperCase() result:  " + builtInUpperCase);

        // checking if both results match
        boolean same = compareStrings(myUpperCase, builtInUpperCase);
        System.out.println("Both results are same? " + same);
    }
}