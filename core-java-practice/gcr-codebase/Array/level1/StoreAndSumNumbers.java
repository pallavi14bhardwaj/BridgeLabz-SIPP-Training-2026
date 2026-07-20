package Array.level1;

import java.util.Scanner;

class StoreAndSumNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter positive numbers:");

        while (true) {

            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            if (index == numbers.length) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        // Display numbers and calculate sum
        System.out.println("\nNumbers Entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal Sum = " + total);

        input.close();
    }
}