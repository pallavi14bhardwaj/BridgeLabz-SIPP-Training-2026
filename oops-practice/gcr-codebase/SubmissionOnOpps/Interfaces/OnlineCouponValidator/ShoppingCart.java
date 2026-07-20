package oppsPracticeProblem.Interfaces.OnlineCouponValidator;
class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        // Coupon is valid if length is at least 5
        // and starts with "SAVE"
        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF20",
                "SAVE50",
                "AB12",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            if (cart.validateCoupon(code)) {
                System.out.println(code + " : Valid Coupon");
            } else {
                System.out.println(code + " : Invalid Coupon");
            }
        }
    }
}