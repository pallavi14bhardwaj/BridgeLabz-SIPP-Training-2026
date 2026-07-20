package Array.level2;
import java.util.Scanner;

class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Store digits in array
        while (number != 0 && index < maxDigit) {

            digits[index] = (int) (number % 10);
            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        input.close();
    }
}