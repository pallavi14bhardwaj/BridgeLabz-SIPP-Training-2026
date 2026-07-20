package RecursionPractice;

import java.util.Scanner;

public class SumNatural {

    // Find sum using recursion
    static int sum(int n) {
        if (n == 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }
}