package oppsPracticeProblem.Interfaces.OnlineCouponValidator;
interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}