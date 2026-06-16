package StringPractices.level1;

import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {

    // accessing index beyond array size will crash the program
    public static void generateException(String[] names) {
        // names.length is already out of range, valid is 0 to length-1
        System.out.println(names[names.length]);
    }

    // same thing but handled safely
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];

        // taking names from user one by one
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // this will crash - uncomment to test
        // generateException(names);

        // this handles it properly
        handleException(names);
    }
}