package MethodsPractices.level1;

import java.util.Scanner;

public class MaxHandshakes {

    // Formula: n*(n-1)/2 gives the number of unique pairs (handshakes)
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int totalHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum possible handshakes among " + numberOfStudents + " students: " + totalHandshakes);

        sc.close();
    }
}