package Array.level1;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display table
        System.out.println("\nMultiplication Table:");

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}