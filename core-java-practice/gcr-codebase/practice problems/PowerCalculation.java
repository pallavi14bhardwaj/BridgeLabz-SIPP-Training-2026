package dsa.practice_problems;
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get the base and exponent
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        // using Math.pow since we aren't supposed to use loops
        double result = Math.pow(base, exponent);
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        scanner.close();
    }
}
