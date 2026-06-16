package StringPractices.level1;

import java.util.Scanner;

class NumberFormatDemo {

    // parseInt will fail if text has letters or symbols
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number is: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something (try letters to see the exception): ");
        String text = sc.next();

        // this crashes if input is not a number - uncomment to test
        // generateException(text);

        // this handles the bad input gracefully
        handleException(text);
    }
}