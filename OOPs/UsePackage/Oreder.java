import ecommerce.Cart;

public class Oreder {
    public static void main(String[] args) {
        Cart obj = new Cart(10);
        obj.addCart("TV", 8500);
        obj.addCart("Notebooks", 450);
        obj.addCart("Vegetable/Fruits", 980);
        obj.addCart("Glossery",3000 );
        obj.addCart("Cloths", 9999);

        obj.displayDetails();
        obj.removeCart("Glossery");
        obj.displayDetails();

        obj.updateCart("Cloths");
        obj.displayDetails();
    }
}