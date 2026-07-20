package RecursionPractice;
import java.util.Scanner;

public class FactorialRecursion {

    // Factorial of 0 and 1 is 1
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}