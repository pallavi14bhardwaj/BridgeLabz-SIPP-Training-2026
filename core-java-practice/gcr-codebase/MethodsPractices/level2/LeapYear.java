package MethodsPractices.level2;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        // Gregorian calendar only works from 1582 onwards
        if (year < 1582) return false;

        // Divisible by 400 → leap year
        // Divisible by 100 but not 400 → NOT a leap year
        // Divisible by 4 but not 100 → leap year
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");

        sc.close();
    }
}