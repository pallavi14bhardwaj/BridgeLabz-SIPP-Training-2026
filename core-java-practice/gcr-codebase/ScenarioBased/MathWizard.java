package ScenarioBased;
import java.util.Scanner;

public class MathWizard {

    public boolean isPrime(int n) {
        if(n <= 1) return false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial(int n) {
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int first = 0;
        int second = 1;
        int next = 0;

        for(int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }

    public double fibonacci(double n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int first = 0;
        int second = 1;
        int next = 0;

        for(int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        MathWizard mathWizard = new MathWizard();
        System.out.println("1.isPrime\n2.factorial\n3.fibonacci\n4.fibonacci\n5.Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                boolean prime = mathWizard.isPrime(n);
                System.out.println(prime);
                break;

            case 2:
                int factResult = mathWizard.factorial(n);
                System.out.println(factResult);
                break;

            case 3:
                int fiboResultA = mathWizard.fibonacci(n);
                System.out.println(fiboResultA);
                break;

            case 4:
                double fiboResultB = mathWizard.fibonacci((double)n);
                System.out.println(fiboResultB);
                break;

            default:
                System.out.println("Exited!");
                break;
        }
    }
}