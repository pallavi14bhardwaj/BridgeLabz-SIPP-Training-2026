package programmingelements.level2;

import java.util.Scanner;

class SquareSideFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double sideLength = perimeter / 4;

        System.out.println("The length of the side is "
                + sideLength
                + " whose perimeter is "
                + perimeter);

        input.close();
    }
}