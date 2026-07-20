package controlFlow.level1;

import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("number1: ");
        int firstNum = sc.nextInt();

        System.out.print("number2: ");
        int secondNum = sc.nextInt();

        System.out.print("number3: ");
        int thirdNum = sc.nextInt();

        boolean firstLargest =
                firstNum > secondNum && firstNum > thirdNum;

        boolean secondLargest =
                secondNum > firstNum && secondNum > thirdNum;

        boolean thirdLargest =
                thirdNum > firstNum && thirdNum > secondNum;

        System.out.println("Is the first number the largest? "
                + firstLargest);

        System.out.println("Is the second number the largest? "
                + secondLargest);

        System.out.println("Is the third number the largest? "
                + thirdLargest);

        sc.close();
    }
}