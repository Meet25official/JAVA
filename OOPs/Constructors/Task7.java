//7. Parameterized Constructor with Default Values:
// Design a 'Laptop' class with fields 'brand', 'model', and 'price'. Implement a constructor that takes 'brand' and 'model' as parameters and sets a default price. Also, implement another constructor that initializes all three fields.

class Laptop{
    private String brand,model;
    private double price;

    public Laptop(String b, String m){
        brand = b;
        model = m;
        price = 62000;
    }

    public Laptop(String b1, String m1 , int p1){
        brand = b1;
        model = m1;
        price = p1;
    }

    void getDetails(){
        System.out.println("The brand of the Laptop is :- "+brand);
        System.out.println("The model of the Laptop is :- "+model);
        System.out.println("The price of the Laptop is :- "+price);
    }

}


public class Task7 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop("Leanovo" , "Ideaped slim 3");
        Laptop obj2 = new Laptop("HP" , "Victus I7" , 80000);
        obj1.getDetails();
        obj2.getDetails();
    }
}
