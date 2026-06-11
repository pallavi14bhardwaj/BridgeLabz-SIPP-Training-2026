package Array.level1;

import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Checking numbers
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last element
        System.out.println();

        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than Last element.");
        } else {
            System.out.println("First element is less than Last element.");
        }

        input.close();
    }
}