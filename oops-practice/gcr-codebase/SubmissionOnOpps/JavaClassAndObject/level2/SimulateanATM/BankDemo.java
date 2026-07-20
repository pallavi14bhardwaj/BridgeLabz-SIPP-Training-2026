package oppsPracticeProblem.JavaClassAndObject.level2.SimulateanATM;
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.accountHolder = "Rahul";
        acc.accountNumber = 12345;
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}