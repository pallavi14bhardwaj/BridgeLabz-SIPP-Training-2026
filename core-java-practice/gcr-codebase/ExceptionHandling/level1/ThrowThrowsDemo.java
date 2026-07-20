package ExceptionHandling.level1;
public class ThrowThrowsDemo {

    // This method may throw an exception
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException(
                    "Amount and rate must be positive");
        }

        double interest = (amount * rate * years) / 100;

        return interest;
    }

    public static void main(String[] args) {

        try {

            double result = calculateInterest(10000, 5, 2);

            System.out.println("Interest = " + result);

            // Uncomment to test exception
            // double result = calculateInterest(-10000, 5, 2);

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}