package dsa.practice_problems;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // asking for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // calculating the area using Math.PI
        double area = Math.PI * radius * radius;
        
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }
}
