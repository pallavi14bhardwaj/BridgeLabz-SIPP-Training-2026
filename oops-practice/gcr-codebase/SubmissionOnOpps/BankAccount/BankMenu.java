package oppsPracticeProblem.BankAccount;

import java.util.Scanner;

public class BankMenu {
    public void bankDisplay(){
        BankUtility bankUtility= new BankUtility();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Welcome to SBI Bank");
        System.out.println("-------------------------------------------------------------------------");

        while(true){
            System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WIHDRAWL\n4.GET STATEMENT\n5.TOTAL BANK ACCOUNTS\n6.EXIT");
            Scanner sc = new Scanner (System.in);
            int choice = sc.nextInt();
            if(choice==6)
                break;
            switch(choice){
                case 1 :
                    bankUtility.createAccount();
                    break;

                case 2 :
                    System.out.println("Enter Amount to Deposit:");
                    double amount = sc.nextInt();
                    bankUtility.deposit(amount);
                    break;

                case 3 :
                    System.out.println("Enter Amount to Withdraw:");
                    amount = sc.nextDouble();
                    bankUtility.withdraw(amount);
                    break;

                case 4 :
                    bankUtility.getStatement();
                    break;

                case 5:
                    bankUtility.totalAccounts();
                    break;

                default :
                    System.out.println("Exit");
            }
        }
    }
}