package StringPractices.level2;

import java.util.Scanner;

class StringLengthFinder {

    // using infinite loop and catching exception when charAt goes out of range
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception means we reached the end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        int myLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("My method length:   " + myLength);
        System.out.println("length() result:    " + builtInLength);
    }
}