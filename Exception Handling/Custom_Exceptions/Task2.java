// 2. Online Shopping Platform: Invalid Coupon Code Exception

// Problem Statement:
// In an online shopping platform, handle cases where an invalid coupon code is applied during checkout. Create a custom exception `InvalidCouponCodeException` to represent this error.

class InvalidCouponCodeException extends Exception {
    public InvalidCouponCodeException(String message) {
        super(message);
    }
}
class ShoppingCart {
    public void applyCoupon(String couponCode) throws InvalidCouponCodeException {
        if (!isValidCoupon(couponCode)) {
            throw new InvalidCouponCodeException("Invalid coupon code: " + couponCode);
        }
        System.out.println("Coupon applied successfully.");
    }

    private boolean isValidCoupon(String couponCode) {
        return "DISCOUNT150".equals(couponCode);
    }
}
public class Task2 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        String couponCode = "INVALIDCODE";

        try {
            cart.applyCoupon(couponCode);
        } catch (InvalidCouponCodeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
