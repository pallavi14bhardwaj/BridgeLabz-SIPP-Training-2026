package ScenarioBased;
import java.util.*;
public class MetroFare {
    public static void main(String[]args){
        double Balance=600.00;
        while(Balance>0){
            System.out.println("------------------------------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter distance in KM or Type -1 to exit");
            double distance = sc.nextDouble();
            if(distance == -1){
                break;
            }
            System.out.println("");

            //Fare Calculation
            double fare=(distance<5)?10:(distance<=10)?20:(distance<=20)?30:50;

            //Balance Calculation
            if(Balance>fare){
                Balance-=fare;
                System.out.println("Available Balance in your card is:-"+Balance);
            }
            else{
                System.out.println("Insufficient Balance!!");
            }
            System.out.println("Thank you for traveling in Delhi Metro");
            System.out.println("------------------------------------------------------------------------------");
        }
        System.out.println("Card time exceeded or balance ");
    }
}