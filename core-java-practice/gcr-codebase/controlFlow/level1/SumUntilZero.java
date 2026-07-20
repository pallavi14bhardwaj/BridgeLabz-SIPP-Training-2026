package controlFlow.level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.println("number");
        double number = sc.nextDouble();

        while (number != 0) {

            total += number;

            number = sc.nextDouble();
        }

        System.out.println("Total Sum = " + total);

        sc.close();
    }
}