package programmingelements.level1;
//Write a program to find the side of the square whose parameter you read from user
//        Hint => Perimeter of Square is 4 times side
//        I/P => perimeter
//        O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

class SquareSideFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println(
                "The length of the side is " +
                        side +
                        " whose perimeter is " +
                        perimeter
        );

        input.close();
    }
}