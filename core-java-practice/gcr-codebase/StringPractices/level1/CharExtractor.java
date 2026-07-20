package StringPractices.level1;

import java.util.Scanner;

class CharExtractor {

    // getting each character one by one and storing in array
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // comparing two char arrays element by element
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        char[] myArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("My method chars: ");
        for (char c : myArray) {
            System.out.print(c + " ");
        }

        System.out.print("\ntoCharArray() chars: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        // final check if both arrays match
        System.out.println("\nBoth arrays match? " + compareCharArrays(myArray, builtInArray));
    }
}