package programmingelements.level2;
//Write a program to take 2 numbers and print their quotient and reminder
//        Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//        I/P => number1, number2
//        O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
import java.util.Scanner;

class QuotientRemainderCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is "
                + quotient
                + " and Reminder is "
                + remainder
                + " of two number "
                + number1
                + " and "
                + number2);

        input.close();
    }
}
