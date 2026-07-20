package ScenarioBased;
import java.util.Scanner;

class Electricity {

    double Units;

    public double electricityBill(double units) {

        double rate = (units <= 50) ? 5 :
                (units <= 100) ? 10 :
                (units <= 200) ? 15 :
                (units <= 300) ? 20 : 30;

        return rate;
    }

    public void generateBill(double units, double amount) {

        System.out.println("WELCOME TO ELECTRICITY BOARD");
        System.out.println("Total Units Consumed = " + units);
        System.out.println("Total Bill = " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electricity ele = new Electricity();

        System.out.print("Enter Units: ");
        ele.Units = sc.nextDouble();

        double rate = ele.electricityBill(ele.Units);

        double totalAmount = ele.Units * rate;

        ele.generateBill(ele.Units, totalAmount);

        sc.close();
    }
}