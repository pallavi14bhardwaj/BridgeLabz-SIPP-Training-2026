package MethodsPractices.level2;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;       // base case
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        int recursiveResult = sumRecursive(n);
        int formulaResult   = sumFormula(n);

        System.out.println("Sum using Recursion : " + recursiveResult);
        System.out.println("Sum using Formula   : " + formulaResult);
        System.out.println("Both results match  : " + (recursiveResult == formulaResult));

        sc.close();
    }
}