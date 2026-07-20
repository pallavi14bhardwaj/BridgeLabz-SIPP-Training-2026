package StringPractices.level1;

import java.util.Scanner;

class IllegalArgumentDemo {

    // start index greater than end index causes this exception
    public static void generateException(String text) {
        // intentionally wrong - start > end
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            // same wrong substring call
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // crashes without handling - uncomment to see
        // generateException(text);

        handleException(text);
    }
}