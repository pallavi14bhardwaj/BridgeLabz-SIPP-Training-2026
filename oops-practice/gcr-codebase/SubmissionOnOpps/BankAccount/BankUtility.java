package oppsPracticeProblem.BankAccount;
import java.util.Scanner;

public class BankUtility {
    BankCustomer bankCustomer;

    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        int account_number = (int)(Math.random()*900000)/100000;
        System.out.println("Enter your Account Name: ");
        String name = sc.nextLine();
        double balance = 50000;
        bankCustomer = new BankCustomer(account_number, name , balance);
        System.out.println("Account Created!!");
        BankCustomer.Bank_TotalAccountNumber++;

    }
    public void deposit(double amount){
        bankCustomer= new BankCustomer(321456, "Pallavi Bhardwaj" , 45000);
        BankCustomer.Bank_TotalAccountNumber++;
        if(amount < 0){
            System.out.println("Invalid Amount!!");
        }
        else{
            bankCustomer.Bank_Balance+= amount;
            System.out.println("Deposited Amount"+amount);
            System.out.println("Current Balance is"+bankCustomer.Bank_Balance);
        }
    }
    public void withdraw (double amount){
        if(amount> bankCustomer.Bank_Balance){
            System.out.println("InsufficientBalance");
        }
        else{
            bankCustomer.Bank_Balance-=amount;
            System.out.println("Withdrawl Amount is"+amount);
            System.out.println("Bank Balance is"+bankCustomer.Bank_Balance);
        }
    }
    public void getStatement(){
        System.out.println(bankCustomer.toString());
    }
    public void totalAccounts() {
        System.out.println("Total Bank Accounts: "
                + BankCustomer.Bank_TotalAccountNumber);
    }
}