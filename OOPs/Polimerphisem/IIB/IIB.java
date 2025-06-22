class Shop {
    public String name;
    public double area;
    public double price;
    public String address;

    Shop() {
        System.out.println("This is a Shop");
    }
}

class Shopkeeper extends Shop {
    Shopkeeper() {
        super();
        // iib  
        System.out.println("ShopKeeper Class");
    }

    {
        //Instance Initializer Block
        name = "Store Name";
        area = 30000;
        price = 25000000;
        address = "Kalol";
        System.out.println("IIB Called");
    }
    String getName(){
        return name;
    }
}


public class IIB {
    public static void main(String[] args) {
        Shopkeeper sk = new Shopkeeper();
        sk.getName();
    }
}
/*
Instace Initializer Block: it is used to initialize the instance data member.
Priority Wise: Constructor > super() > iib > body of constructor

Tasks:
*/
