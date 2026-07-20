package controlFlow.level2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("number");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int result = number * i;

            System.out.println(number + " * " + i +
                    " = " + result);
        }

        sc.close();
    }
}