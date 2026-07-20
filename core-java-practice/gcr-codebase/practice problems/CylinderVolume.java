package dsa.practice_problems;
import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get the radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        // get the height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // volume formula: pi * r^2 * h
        double volume = Math.PI * radius * radius * height;
        
        System.out.println("The volume of the cylinder is: " + volume);
        
        scanner.close();
    }
}
