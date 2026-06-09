package programmingelements.level1;
//Create a program to find the maximum number of handshakes among N number of students.
//        Hint =>
//        Get integer input for numberOfStudents variable.
//        Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//        Display the number of possible handshakes.

import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int maximumHandshakes =
                (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
                "The maximum number of possible handshakes is " + maximumHandshakes
        );

        input.close();
    }
}