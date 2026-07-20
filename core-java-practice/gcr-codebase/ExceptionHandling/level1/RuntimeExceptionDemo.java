package ExceptionHandling.level1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            // Happens when dividing by zero
            System.out.println("Cannot divide by zero.");

        } catch (InputMismatchException e) {
            // Happens if user enters letters instead of numbers
            System.out.println("Please enter only numbers.");
        }

        sc.close();
    }
}