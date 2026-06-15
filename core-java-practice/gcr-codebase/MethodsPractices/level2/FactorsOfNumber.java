package MethodsPractices.level2;
import java.util.Scanner;

public class  FactorsOfNumber {

    // First loop counts factors, second loop fills the array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int f : factors) sumOfSquares += Math.pow(f, 2);
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum of Factors: "           + findSum(factors));
        System.out.println("Product of Factors: "         + findProduct(factors));
        System.out.println("Sum of Squares of Factors: "  + findSumOfSquares(factors));

        sc.close();
    }
}