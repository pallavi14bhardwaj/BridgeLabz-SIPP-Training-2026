package dsa.practice_problems;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // taking temperature in celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // applying the formula to convert to fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        
        scanner.close();
    }
}
