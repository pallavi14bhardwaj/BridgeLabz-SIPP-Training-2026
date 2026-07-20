package Array;

import java.util.Scanner;

class MultiplicationTableSixToNine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] multiplicationResult = new int[4];

        // Store results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results
        System.out.println("\nMultiplication Table (6 to 9):");

        for (int i = 6; i <= 9; i++) {
            System.out.println(
                    number + " * " + i + " = " + multiplicationResult[i - 6]
            );
        }

        input.close();
    }
}