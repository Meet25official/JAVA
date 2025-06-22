//10. Computer Class: Create a `Computer` class with a constructor to store information about a computer, including its brand, model, and price.

class Computer{
    private String brand , model;
    private double price;

    public Computer(String b, String m , double p){
        brand = b;
        model = m;
        price = p;
    }

    public void displayDetails(){
        System.out.println("Brand : " + brand);
        System.out.println("Model name : " + model);
        System.out.println("Price : " + price);
    }
}
public class Task19 {
    public static void main(String[] args) {
        Computer obj = new Computer("Leanove", "Ideaped slim 3", 62000);
        obj.displayDetails();
    }    
}
