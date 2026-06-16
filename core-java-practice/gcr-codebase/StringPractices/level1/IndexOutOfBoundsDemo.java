package StringPractices.level1;

import java.util.Scanner;

class IndexOutOfBoundsDemo {

    // accessing an index that doesn't exist - will crash program
    public static void generateException(String text) {
        // text.length() is already out of range, valid is 0 to length-1
        System.out.println(text.charAt(text.length()));
    }

    // doing the same thing but catching the error
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // this will crash - uncomment to test
        // generateException(text);

        // this handles it properly
        handleException(text);
    }
}