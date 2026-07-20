package dsa.practice_problems;
import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // getting the three numbers
        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double n3 = scanner.nextDouble();
        
        // finding the average
        double average = (n1 + n2 + n3) / 3;
        
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
