//Scenario 2: Online Store
//In an online store application, use the "public" access modifier for methods that provide services to customers, such as adding items to a shopping cart or processing payments.

class Cart{
    private String name;
    private double price;

    public Cart(String name , double price){
        this.name = name;
        this.price = price;
    }

    public void addItem(){
        System.out.println("Name :- "+name);
        System.out.println("Price :- "+price);
        System.out.println("Item added successfuly.");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Cart obj = new Cart("TV", 8500);
        obj.addItem();
    }
}