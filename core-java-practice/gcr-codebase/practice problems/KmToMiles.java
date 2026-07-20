package dsa.practice_problems;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // read distance in km
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        // convert to miles
        double miles = kilometers * 0.621371;
        
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        scanner.close();
    }
}
