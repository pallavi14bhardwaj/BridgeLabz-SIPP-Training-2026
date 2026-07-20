package controlFlow.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("salary, yearsOfService");

        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus Amount = " + bonus);

        sc.close();
    }
}