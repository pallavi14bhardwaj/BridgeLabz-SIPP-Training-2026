package MethodsPractices.level1;

import java.util.Scanner;

public class NumberSign {

    // Returns 1 for positive, -1 for negative, 0 for zero
    public static int checkSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = checkSign(number);

        if (result == 1)       System.out.println(number + " is a Positive number.");
        else if (result == -1) System.out.println(number + " is a Negative number.");
        else                   System.out.println("The number is Zero.");

        sc.close();
    }
}