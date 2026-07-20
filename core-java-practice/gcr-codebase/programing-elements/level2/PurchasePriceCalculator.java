package programmingelements.level2;

import java.util.Scanner;
//Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

class PurchasePriceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPurchasePrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "
                + totalPurchasePrice
                + " if the quantity "
                + quantity
                + " and unit price is INR "
                + unitPrice);

        input.close();
    }
}
