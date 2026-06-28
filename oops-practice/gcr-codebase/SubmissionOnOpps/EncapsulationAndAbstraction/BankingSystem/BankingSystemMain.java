package oppsPracticeProblem.EncapsulationAndAbstraction.BankingSystem;

public class BankingSystemMain {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("SA101");
        sa.setHolderName("pallavi");
        sa.setBalance(10000);
        sa.setInterestRate(5);

        sa.deposit(2000);
        sa.withdraw(1000);

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("CA101");
        ca.setHolderName("daisy");
        ca.setBalance(20000);
        ca.setMonthlyBonusRate(2);

        ca.deposit(3000);
        ca.withdraw(2000);

        System.out.println("Savings Account");
        sa.displayAccountDetails();
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println();

        System.out.println("Current Account");
        ca.displayAccountDetails();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}