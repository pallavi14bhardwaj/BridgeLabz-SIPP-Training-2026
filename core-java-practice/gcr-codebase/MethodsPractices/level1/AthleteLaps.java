package MethodsPractices.level1;

import java.util.Scanner;

public class AthleteLaps {

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeterInMeters = side1 + side2 + side3;
        double totalDistanceInMeters = 5000; // 5 km = 5000 meters
        return (int) Math.ceil(totalDistanceInMeters / perimeterInMeters);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");

        sc.close();
    }
}