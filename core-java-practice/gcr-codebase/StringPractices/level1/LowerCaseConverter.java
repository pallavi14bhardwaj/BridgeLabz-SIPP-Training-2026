package StringPractices.level1;

import java.util.Scanner;

class LowerCaseConverter {

    // converting uppercase to lowercase using ASCII difference of 32
    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // if character is uppercase letter, add 32 to get lowercase
            if (ch >= 65 && ch <= 90) {
                result = result + (char)(ch + 32);
            } else {
                // not an uppercase letter, keep it as it is
                result = result + ch;
            }
        }
        return result;
    }

    // same compare method as before
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

        String myLowerCase = convertToLowerCase(text);
        String builtInLowerCase = text.toLowerCase();

        System.out.println("My method result:      " + myLowerCase);
        System.out.println("toLowerCase() result:  " + builtInLowerCase);

        // checking if both results match
        boolean same = compareStrings(myLowerCase, builtInLowerCase);
        System.out.println("Both results are same? " + same);
    }
}
