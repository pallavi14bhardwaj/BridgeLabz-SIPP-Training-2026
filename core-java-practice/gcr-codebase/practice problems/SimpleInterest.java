package dsa.practice_problems;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // asking for principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        
        // asking for the rate of interest
        System.out.print("Enter the Rate of interest: ");
        double rate = scanner.nextDouble();
        
        // asking for the time period
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();
        
        // calculating simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("The Simple Interest is: " + simpleInterest);
        
        scanner.close();
    }
}
