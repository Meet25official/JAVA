// 2. Online Shopping Platform: Invalid Coupon Code Exception

// Problem Statement:
// In an online shopping platform, handle cases where an invalid coupon code is applied during checkout. Create a custom exception `InvalidCouponCodeException` to represent this error.

class InvalidCouponCodeException extends Exception{
    public InvalidCouponCodeException(String messege){
        super(messege);
    }
}

class Shopping{
    private String name;
    private String code;
    private double price;

    public Shopping(String name , String code , double price){
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public void Matcher()throws InvalidCouponCodeException{
        if (code != "CH0704HIM"){
            throw new InvalidCouponCodeException("Invailid Coupon Code please enter vailid code.");
        }
        else{
            System.out.println("Congratulation Your Coupon code is match successfully.");
            System.out.println("Your Item name is :- "+name+" and price is :- "+price);
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shopping obj = new Shopping("TV", "CH074HIM",8500);
        try {
            obj.Matcher();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}