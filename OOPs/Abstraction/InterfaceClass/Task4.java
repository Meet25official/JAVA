//Scenario 4: Online Ordering System
// Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.

interface OrderProcessor{
    void placeOrder();
    void cancelOrder();
}

class CreditCardProcessor implements OrderProcessor{
    private String name;
    private double price;
    private String type;

    public CreditCardProcessor(String name , double price , String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public void placeOrder(){
        System.out.println("The order is recive.");
        System.out.println("The name of the order is :- "+name);
        System.out.println("The price of this order is :- "+price);
        System.out.println("The payment type of this order is :- "+type);
    }

    @Override
    public void cancelOrder(){
        System.out.println("The order is Cancel by the user.");
    }
}

class PayPalProcessor implements OrderProcessor{
    private String name;
    private double price;
    private String type;

    public PayPalProcessor(String name , double price , String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public void placeOrder(){
        System.out.println("The order is recive.");
        System.out.println("The name of the order is :- "+name);
        System.out.println("The price of this order is :- "+price);
        System.out.println("The payment type of this order is :- "+type);
    }

    @Override
    public void cancelOrder(){
        System.out.println("The order is Cancel by the user.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        CreditCardProcessor obj1= new CreditCardProcessor("Paint", 999, "CreditCard");
        PayPalProcessor obj2 = new PayPalProcessor("TV", 8500, "PayPal");

        obj1.placeOrder();
        obj1.cancelOrder();

        obj2.placeOrder();
        obj2.cancelOrder();
    }
}