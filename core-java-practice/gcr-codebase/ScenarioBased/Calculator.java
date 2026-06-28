package ScenarioBased;

import java.util.Scanner;

class Calculator {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public void divide(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        System.out.println("Enter your choice from menu");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                calc.add(10, 20);
                break;
            case 2:
                calc.subtract(30, 10);
                break;
            case 3:
                calc.multiply(2, 5);
                break;
            case 4:
                calc.divide(4, 2);
                break;
            default:
                System.out.println("Wrong choice");
        }

        sc.close();
    }
}