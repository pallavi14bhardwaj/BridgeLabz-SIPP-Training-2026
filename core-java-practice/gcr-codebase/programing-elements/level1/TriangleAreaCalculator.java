package programmingelements.level1;
//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
//        Hint => Area of a Triangle is ½ * base * height
//        I/P => base, height
//        O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;
        double areaInSqInches = areaInSqCm / 6.4516;

        System.out.println(
                "Area in square centimeters is " +
                        areaInSqCm +
                        " and area in square inches is " +
                        areaInSqInches
        );

        input.close();
    }
}