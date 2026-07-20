package StringPractices.level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] findBMI(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height into meter
            double heightM = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightM * heightM);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the table
    public static void display(String[][] result) {

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2] + "\t"
                    + result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = findBMI(data);

        display(result);

        sc.close();
    }
}