package Array.level2;

import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmounts = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking employee details
        for (int i = 0; i < salaries.length; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salaries[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            // Validation
            if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid Input! Enter again.");
                i--;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < salaries.length; i++) {

            if (yearsOfService[i] > 5) {
                bonusAmounts[i] = salaries[i] * 0.05;
            } else {
                bonusAmounts[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonusAmounts[i];

            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}