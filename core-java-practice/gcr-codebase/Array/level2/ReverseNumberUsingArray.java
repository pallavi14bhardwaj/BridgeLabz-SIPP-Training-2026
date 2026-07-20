package Array.level2;

import java.util.Scanner;

class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int digitCount = 0;

        // Count digits
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        // Store digits in array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display reversed number
        System.out.print("Reversed Number: ");

        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}