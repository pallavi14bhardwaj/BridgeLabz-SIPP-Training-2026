package JavaInputOutput.level1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter("expenses.txt", true);

            System.out.print("How many expenses do you want to enter? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= n; i++) {

                System.out.print("Expense Name: ");
                String name = sc.nextLine();

                System.out.print("Amount: ");
                int amount = sc.nextInt();
                sc.nextLine();

                fw.write(name + " - " + amount);
                fw.write("\n");
            }

            fw.close();

            System.out.println("Expenses saved successfully.");

        } catch (IOException e) {
            System.out.println("Unable to save expenses.");
        }

        sc.close();
    }
}