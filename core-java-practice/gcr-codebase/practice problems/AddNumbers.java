package dsa.practice_problems;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // asking the user for the first number
        System.out.print("Hey, enter the first number: ");
        int num1 = scanner.nextInt();
        
        // asking for the second number
        System.out.print("Now enter the second number: ");
        int num2 = scanner.nextInt();
        
        // calculating the sum and showing it
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
