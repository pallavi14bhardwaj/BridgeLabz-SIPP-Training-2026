package StringPractices.level1;

import java.util.Scanner;

class StringComparer {

    // manually compare two strings character by character
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

        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean myResult = compareStrings(s1, s2);
        boolean builtInResult = s1.equals(s2);

        System.out.println("My method result: " + myResult);
        System.out.println("equals() result: " + builtInResult);

        // checking if both give same answer
        if (myResult == builtInResult) {
            System.out.println("Both methods give the same result!");
        } else {
            System.out.println("Results don't match, something is wrong.");
        }
    }
}