package ScenarioBased;

import java.util.Scanner;

public class CoffeeShop {
    String CoffeeTypes;
    int Quantity;

    public double calculatePrice(double price) {

        double bill=price*Quantity;
        double gst=bill*0.18;
        double finalBill = bill+gst;
        return finalBill;

    }
    public void generateBill(double bill){
        System.out.println("-----------------------------------------------");
        System.out.println("COFFEE TYPE:- " + CoffeeTypes);
        System.out.println("QUANTITY-> " + Quantity);
        System.out.println("Bill AMOUNT-> " + bill);
        System.out.println("THANK YOU FOR VISITING!");
        System.out.println("-----------------------------------------------");
    }
    public static void main(String[]  args){
        System.out.println("Choose Coffee Type or Exit!");
        System.out.println("1.Cappaccino:-150\n2.Latte:-250\n3.Esspresso:-400\n4.Americano:-300\n5.BlackCoffee:-200");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        CoffeeShop coffee = new CoffeeShop();
        System.out.println("Quantity");
        coffee.Quantity=scanner.nextInt();

        switch(choice){
            case 1:
                coffee.generateBill(coffee.calculatePrice(150));
                coffee.CoffeeTypes="Cappaccino";
                break;
            case 2:
                coffee.generateBill(coffee.calculatePrice(250));
                coffee.CoffeeTypes="Latte";
                break;
            case 3:
                coffee.generateBill(coffee.calculatePrice(400));
                coffee.CoffeeTypes="Esspresso";
                break;
            case 4:
                coffee.generateBill(coffee.calculatePrice(300));
                coffee.CoffeeTypes="Americano";
                break;
            case 5:
                coffee.generateBill(coffee.calculatePrice(200));
                coffee.CoffeeTypes="BlackCoffee";
                break;

        }
    }
}
